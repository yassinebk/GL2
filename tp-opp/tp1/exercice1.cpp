#include <stdio.h>
#include <iostream>

using namespace std;
void afficherExercice1()
{
    int A = 1, B = 2, C = 3;
    int *P1, *P2;
    P1 = &A;
    P2 = &C;
    *P1 = (*P2)++;
    P1 = P2;
    P2 = &B;
    *P1 -= *P2;
    ++*P2;
    *P1 *= *P2;
    A = ++*P2 * *P1;
    P1 = &A;
    *P2 = *P1 /= *P2;
    printf("%d %d %d", A, B, C);
    printf("\n \n");
}

void afficherTableau(int *A, int length)
{
    for (int i = 0; i < length; i++)
        printf("|\t %d \t|", A[i]);

    printf("\n \n");
}

void remplirTableau(int *A, int length)
{
    for (int i = 0; i < length; i++)
    {
        int newNumber;
        int k;
        do
        {
            k = scanf("%d", &newNumber);
        } while (k == 0);
        A[i] = newNumber;
    }
}

int squareValue(int n)
{
    cout << "In square(): " << &n << endl; // 0x22ff00
    n *= n;
    return n;
}
void squarePtr(int *pNumber)
{
    cout << "In square(): " << pNumber << endl; // 0x22ff1c
    *pNumber *= *pNumber;
}
void squareRef(int &rNumber)
{
    cout << "In square(): " << &rNumber << endl; // 0x22ff1c
    rNumber *= rNumber;
}

int main()
{
    afficherExercice1();
    int tab[10];
    remplirTableau(tab, 10);
    afficherTableau(tab, 10);
    int &ref5 = tab[4];
    printf("a reference to element 5  value %d \t address:%d\n", ref5, (tab + 4));
    ++ref5;
    printf("incremented element 5  value %d \t address:%d\n", tab[4]);
    int *ref7 = &(tab[6]);
    printf("a reference to element 5  value %d \t address: %d\n", *ref7, ref7);
    *(++ref7)++;
    printf("incremented element 7  value %d \t address %d\n", *ref7, ref7);

    int testNumber = 10;
    squareValue(testNumber);
    cout << "By Value\t" << testNumber << endl;
    squareRef(testNumber);
    cout << "By Reference:\t" << testNumber << endl;
    squarePtr(&testNumber);
    cout << "By Pointer\t" << testNumber << endl;

    return 0;
}
