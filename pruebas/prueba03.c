/* Clasifica varios números */
void clasifica(int n)
{
    if (n < 10)
        if (n < 5) output(1);
        else output(2);
    else
        output(3);
}

void main(void)
{
    clasifica(3);
    clasifica(7);
    clasifica(12);
    if (0 == 1) output(9);
    output(4);
}
