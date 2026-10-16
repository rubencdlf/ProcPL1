/* Ordena un vector por el método de la burbuja */
int v[8];

void intercambia(int a[], int i, int j)
{
    int aux;
    aux = a[i];
    a[i] = a[j];
    a[j] = aux;
}

void ordena(int a[], int n)
{
    int i; int j;
    i = 0;
    while (i < n - 1) {
        j = 0;
        while (j < n - 1 - i) {
            if (a[j] > a[j + 1])
                intercambia(a, j, j + 1);
            j = j + 1;
        }
        i = i + 1;
    }
}

void main(void)
{
    int i;
    v[0] = 42; v[1] = 7; v[2] = 19; v[3] = 3;
    v[4] = 25; v[5] = 11; v[6] = 30; v[7] = 1;
    ordena(v, 8);
    i = 0;
    while (i < 8) {
        output(v[i]);
        i = i + 1;
    }
}
