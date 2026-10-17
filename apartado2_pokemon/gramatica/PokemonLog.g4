grammar PokemonLog;


//Regla inicial, punto de entrada al programa
start_game: setup_block EOF; //Ponemos end of file

setup_block:    SETUP 
                coin_selection 
                coin_result 
                first_decision
                drew_result* 
                initial_play* 
                player_won;
//===========================
//Reglas sintacticas (parser)
//===========================

//Personaje elige moneda
coin_selection: ID_PLAYER CHOOSE (HEADS | TAILS) FOR THE OPENING COIN FLIP DOT;
coin_result: ID_PLAYER WIN THE COIN TOSS DOT;
first_decision: ID_PLAYER DECIDE TO GO FIRST DOT;
cards_list: DASH ID_CARD (COMMA ID_CARD)*; //CAMBIAR A BULLET EN VEZ DE DASH (PROVISIONAL POR EL COMPILADOR)

drew_result: ID_PLAYER DRAW NUM CARD FOR THE OPENING HAND DOT DASH NUM DRAW CARD DOT cards_list?;


initial_play: ID_PLAYER PLAY ID_CARD TO THE ACTIVE SPOT DOT
            | ID_PLAYER PLAY ID_CARD TO THE BENCH DOT ;

player_won: ID_PLAYER WIN DOT;


//============================================
//Reglas léxicas (lexer o palabras reservadas)
//============================================
//Palabra reservada de iniciación (Setup)
SETUP: 'Setup';


//Palabras generales (preposiciones, determinantes ...)
FOR : 'for' ;
THE : 'the' ;
TO: 'to';


//Elección de moneda
HEADS: 'heads';
TAILS: 'tails';

OPENING : 'opening' ;
COIN: 'coin' ;
FLIP: 'flip' ;

FIRST: 'first';
TOSS: 'toss';

//Selección de cartas
CARD: 'card' ('s')?;
HAND: 'hand';

ACTIVE: 'active';
SPOT: 'spot';
BENCH: 'bench';

//Verbos
//Verbos de estado y auxiliares
BE: 'is' | 'was' | 'were' ;
GO: 'go';

// De preparación y victoria
CHOOSE: 'chose' ;
DECIDE: 'decided' ;
WIN: 'won' | 'wins' ;
CONCEDE: 'conceded' ;

// ACCIONES DE ROBO Y MANO
DRAW: 'drew' | 'drawn' ; //robar
ADD: 'added' ;

// ACCIONES DE TABLERO Y CARTAS
PLAY: 'played' ;
ATTACH: 'attached' ;
EVOLVE: 'evolved' ;
USE: 'used' ;
RETREAT: 'retreated' ;
MOVE: 'moved' ;
SHUFFLE: 'shuffled' ;
DISCARD: 'discarded' ;
SWITCH: 'switched' ;

// ACCIONES DE COMBATE Y PREMIOS
KNOCK_OUT: 'Knocked Out' ;
TAKE: 'took' | 'taken' ;

// ACCIONES DE TURNO
END: 'ended' ;


//CORREGIR LOS NOMBRES PROVISIONALES
//Nombres de las barajas
//ID_DECK : [a-zA-Z0-9]+; estan mal porque son lo mismo que idplayer

//Nombres de las cartas
ID_CARD: ID_POKEMON | ID_ENERGY_CARD | ID_POKEMON_TRAINER ;

//fragment indica al analizador sintactico que solo se tiene que enviar el valor superior (id_card)
fragment ID_POKEMON: 'Makuhita' 
                   | 'Okidogi' 
                   | 'Mega Lucario ex' 
                   | 'Riolu' ;

fragment ID_ENERGY_CARD: 'Basic Fighting Energy' ;

fragment ID_POKEMON_TRAINER: 'Lillie\'s Determination' 
                           | 'Boss\'s Orders' ;


//=============================
//Caracteres especiales y otros
DOT    : '.' ;
DASH   : '-' ;
COMMA  : ',' ;
BULLET : '•' ;

//Números
NUM : [0-9]+ ;
//Personajes: al final por la prioridad de los archivos, si no coincide ninguno significa que es un nombre
ID_PLAYER : [a-zA-Z0-9]+ ('\'s')?;


WS : [ \t\r\n]+ -> skip; //Fundamental para ignorar las tabulaciones, las lineas siguientes y retornos de carro

//=============================

