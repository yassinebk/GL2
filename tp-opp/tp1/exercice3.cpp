#include <cstdlib>
int main()
{

    int *adi;
    double *add;
     adi = (int *)malloc(sizeof(int));
    add = (double *)malloc(sizeof(double) * 100);
    adi = new int;
    add = new double[100];
}