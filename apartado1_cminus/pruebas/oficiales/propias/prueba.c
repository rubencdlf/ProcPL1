void main(void) {
    int x; bool flag; char letra;
    letra = '\n';
    flag = true;
    for (x = 0; x < 10; x = x + 1) {
        if (!flag && x % 2 == 0 || -x < -5) {
            output(x);
        }
    }
}