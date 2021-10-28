#include <stdio.h>
#include <iostream>
#include <vector>
#include <string>

using namespace std;
void *premierVersion(int longueurTableau)
{

    char **c = new char *[longueurTableau];
    for (int i = 0; i < longueurTableau; i++)
    {
        c[i] = new char[100];
    }

    for (int i = 0; i < longueurTableau; i++)
    {
        fflush(stdin);
        scanf("%s", c[i]);
    }
    for (int i = 0; i < longueurTableau; i++)
    {
        cout << c[i] << "||\t";
    }
    cout << "finish" << endl;
}
void deuxiemeVersion(int longueur)
{

    vector<string> c;
    // c.resize(longueur); ou bien

    for (int i = 0; i < longueur; i++)
    {
        string k;
        cin >> k;
        c.push_back(k);
    }
    for (int i = 0; i < longueur; i++)
    {
        cout << c[i];
    }
    cout << endl;

    cout << "finish" << endl;
}
int main()
{
    premierVersion(3);
    printf("\n \n deuxieme programme");
    deuxiemeVersion(3);
    return 0;
}