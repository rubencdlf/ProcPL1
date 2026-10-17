/* Funciones recursivas */
int factorial(int n)
{
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

int mcd(int a, int b)
{
    if (b == 0) return a;
    else return mcd(b, a - a / b * b);
}

void main(void)
{
    output(factorial(5));
    output(mcd(48, 18));
    output(mcd(factorial(4), 9));
}
