/* Cuenta atrás */
void main(void)
{
    int n;
    n = 5;
    int paso;
    paso = 1;
    while (n > 0) {
        output(n);
        n = n - paso;
    }
}
