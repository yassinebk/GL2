#include <stdio.h>

int test(int k)
{

    return 0;
}

int test(float k)
{
    return 0;
}
int main()
{
    test(1);
    test(1.0f);
    return 0;
}