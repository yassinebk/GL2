

void Correction1()
{
    int *p;
    int x = 34;
    p = &x; //correction assignment integer to pointer
}

void Correction2()
{
    int x = 17;
    int *p = &x; // correction assignment integer to pointer
    *p = 17;
}

void Correction3()
{
    int *q; //correction
    int x = 17;
    int *p = &x;
    q = p; // assignment int* to double*
}

void Correction4()
{
    int x;
    int *p;
    p = &x; //illegal operation
}

void Correction5()
{
    char mot[10];
    char car = 'A';
    char *pc = &car;
    *mot = *pc; // illegal operation
}

int main()
{
}