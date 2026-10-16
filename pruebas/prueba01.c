/* Los 10 primeros de Fibonacci */
void main(void)
{
    int a; int b; int t; int i;
    a = 0;
    b = 1;
    i = 0;
    while (i < 10) {
        output(a);
        t = a + b;
        a = b;
        b = t;
        i = i + 1;
    }
}
