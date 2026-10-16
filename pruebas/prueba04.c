/* Funciones con valor de retorno y una variable global */
int contador;

int cuadrado(int x)
{
    return x * x;
}

int maximo(int a, int b)
{
    if (a > b) return a;
    return b;
}

void anota(void)
{
    contador = contador + 1;
}

void main(void)
{
    contador = 0;
    output(cuadrado(7));
    output(maximo(cuadrado(3), 8));
    anota();
    ;
    anota();
    output(contador);
}
