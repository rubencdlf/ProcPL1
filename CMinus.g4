grammar CMinus;

// --- REGLAS SINTÁCTICAS (Parser) ---

// 1. Un programa es una lista de declaraciones. Añadimos EOF para indicar el final del archivo.
program : declaration_list EOF ;

// 2. Una lista de declaraciones es una o más declaraciones. En ANTLR usamos '+' para indicar "uno o más".
declaration_list : declaration+ ;

// 3. Una declaración puede ser de variable o de función
declaration : var_declaration | fun_declaration ;

// 4. Declaración de variable: tipo ID ;  O  tipo ID [ NUM ] ;
// Usamos los tokens en mayúscula que definiste en tu Lexer
var_declaration : type_specifier ID SEMI
                | type_specifier ID LBRACKET NUM RBRACKET SEMI ;

// 5. Especificador de tipo: int o void
type_specifier : INT | VOID | CHAR | BOOL ; //

// 6. Declaración de una función: tipo nombre ( parámetros ) bloque
fun_declaration : type_specifier ID LPAREN params RPAREN compound_stmt ;

// 7 y 8. Los parámetros pueden ser la palabra 'void' o una lista iterativa separada por comas
params : param_list | VOID ;
param_list : param (COMMA param)* ;

// 9. Un parámetro es un tipo y un ID, opcionalmente seguido de corchetes vacíos '[]'
// En ANTLR, el cierre de interrogación '?' significa "opcional"
param : type_specifier ID (LBRACKET RBRACKET)? ;

// 10. Un bloque de código o sentencia compuesta va entre llaves
compound_stmt : LBRACE local_declarations statement_list RBRACE ;

// 11 y 12. Las declaraciones locales y la lista de sentencias pueden aparecer 0 o más veces ('*')
local_declarations : var_declaration* ;
statement_list : statement* ;

// 13. Tipos de sentencias
statement : expression_stmt | compound_stmt | selection_stmt | iteration_stmt | return_stmt ;

// 14. Una expresión seguida de punto y coma (el ? permite que esté vacía, solo ';')
expression_stmt : expression? SEMI ;

// 15. If / Else. ANTLR asocia automáticamente el 'else' al 'if' más cercano
selection_stmt : IF LPAREN expression RPAREN statement (ELSE statement)? ;

// 16. Bucle while
iteration_stmt : WHILE LPAREN expression RPAREN statement
               | FOR LPAREN expression? SEMI expression? SEMI expression? RPAREN statement ;

// 17. Return con valor opcional
return_stmt : RETURN expression? SEMI ;

// 18. Expresiones (asignación o simples)
expression : var ASSIGN expression | or_expr ;

or_expr : and_expr (OR and_expr)* ;
and_expr : simple_expression (AND simple_expression)* ;

// 19. Variables simples o posiciones de arrays
var : ID (LBRACKET expression RBRACKET)? ;

// 20 y 21. Operadores relacionales
simple_expression : additive_expression (relop additive_expression)? ;
relop : LTEQ | LT | GT | GTEQ | EQ | NEQ ;

// 22 y 23. Sumas y restas (ANTLR maneja la recursividad izquierda sin problemas)
additive_expression : additive_expression addop term | term ;
addop : PLUS | MINUS ;

// 24 y 25. Multiplicaciones y divisiones
unary_expr : MINUS unary_expr | NOT unary_expr | factor ;
term : term mulop unary_expr | unary_expr ;
mulop : MULT | DIV | MOD ;

// 26. Factores básicos
factor : LPAREN expression RPAREN | var | call | NUM | CHAR_LIT | TRUE_VAL | FALSE_VAL ;

// 27, 28 y 29. Llamadas a funciones y sus argumentos iterativos
call : ID LPAREN args RPAREN ;
args : arg_list? ;
arg_list : expression (COMMA expression)* ;


// --- REGLAS LÉXICAS (Palabras reservadas) ---
ELSE : 'else' ;
IF : 'if' ;
INT : 'int' ;
RETURN : 'return' ;
VOID : 'void' ;
WHILE : 'while' ;
// Añadidas para el Nivel Medio:
FOR : 'for' ;
CHAR : 'char' ;
BOOL : 'bool' ;
TRUE_VAL : 'true' ;
FALSE_VAL : 'false' ;

// --- REGLAS LÉXICAS (Identificadores y literales) ---
ID : [a-zA-Z]+ ;
NUM : [0-9]+ ;
// Añadido para Nivel Medio:
// Un char literal es un carácter entre comillas simples ('a') o un escape ('\n').
CHAR_LIT : '\'' ( '\\' . | ~['\\\r\n] ) '\'' ;

// --- REGLAS LÉXICAS (Símbolos especiales) ---
// Definimos los caracteres como nombres en vez de ponerlas como conjunto para así
// tratarlo de forma más cómoda en el futuro
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
LT : '<' ;
LTEQ : '<=' ;
GT : '>' ;
GTEQ : '>=' ;
EQ : '==' ;
NEQ : '!=' ;
ASSIGN : '=' ;
SEMI : ';' ;
COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
LBRACE : '{' ;
RBRACE : '}' ;
// Añadir símbolos para Nivel Medio:
MOD : '%' ;
AND : '&&' ;
OR : '||' ;
NOT : '!' ;

// --- REGLAS LÉXICAS (Ignoradas) ---
WS : [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;




/* 
========================================================================
JUSTIFICACIÓN DE DECISIONES DE DISEÑO - APARTADO 1 (NIVEL MEDIO)
========================================================================
En cumplimiento con los requisitos de la memoria[cite: 13, 19], 
se detallan las decisiones de precedencia y sintaxis adoptadas para 
las ampliaciones del lenguaje C-:

1. Tipos básicos y literales (char, bool):
   - Sintaxis: Se han añadido 'char' y 'bool' a la regla 'type_specifier' 
     junto a 'int' y 'void'. 
   - Literales: Los valores 'true', 'false' y los caracteres entre comillas 
     simples (incluyendo secuencias de escape como '\n') se han integrado 
     directamente en la regla 'factor'. Esto asegura que el analizador 
     los trate como valores indivisibles (hojas del AST) con la máxima prioridad.

2. Bucle FOR:
   - Sintaxis: Se ha definido como 'for (expression?; expression?; expression?) statement'.
   - Justificación: Se permite que las tres expresiones de la cabecera sean 
     opcionales (mediante el operador '?') para respetar el estándar de C, 
     donde bucles como 'for(;;)' son válidos. La validación de bucles infinitos 
     o errores lógicos por falta de actualización se delega a fases semánticas 
     posteriores.

3. Precedencia del Módulo (%):
   - Diseño: Se ha incorporado el símbolo '%' dentro de la regla 'mulop', 
     compartiendo jerarquía jerárquica con la multiplicación ('*') y la división ('/').
   - Justificación: El operador módulo comparte matemáticamente el mismo nivel 
     de asociatividad y precedencia que la multiplicación y la división.

4. Operadores Unarios (-, !):
   - Diseño: Se ha creado una nueva regla 'unary_expr' intercalada entre 
     'term' (multiplicaciones) y 'factor' (valores base). 
   - Justificación: Los operadores unarios requieren una precedencia casi máxima. 
     Deben evaluarse antes que cualquier operación aritmética. Al obligar a 'term' 
     a derivar en 'unary_expr', garantizamos que expresiones como '-x * 5' 
     o '!flag == false' apliquen el unario sobre la variable antes de operar con ella.

5. Operadores Lógicos (&&, ||):
   - Diseño: Se han creado las reglas 'or_expr' y 'and_expr' en la cúspide de 
     las operaciones (justo por debajo de la asignación 'expression'), envolviendo 
     a 'simple_expression' (operadores relacionales <, >, ==).
   - Justificación: Los operadores lógicos tienen la prioridad más baja porque 
     su función es concatenar comparaciones ya resueltas. Estructurar 'or_expr' 
     por encima de 'and_expr' asegura que el 'AND' (&&) tenga mayor prioridad 
     evaluativa que el 'OR' (||), imitando el comportamiento nativo de C.
========================================================================
*/