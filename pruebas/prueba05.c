/* Arrays: global, local y como parámetro */
int datos[5];

int suma(int v[], int n)
{
    int i; int total;
    i = 0;
    total = 0;
    while (i < n) {
        total = total + v[i];
        i = i + 1;
    }
    return total;
}

void main(void)
{
    int copia[5]; int i;
    i = 0;
    while (i < 5) {
        datos[i] = i * i;
        copia[i] = datos[i] + 1;
        i = i + 1;
    }
    output(suma(datos, 5));
    output(suma(copia, 5));
    output(datos[copia[1]]);
}
