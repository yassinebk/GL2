int *mauvais1(int n)
{
    int tab[n];
    for (int i = 0; i < n; i++))
                cin >> tab[i]
return tab; // de meme ici
}
const int MAX = 50;

int *mauvais2()
{
    int tab[MAX];
    for (int i = 0; i < MAX; i++))
        cin >> tab[i]
return tab; // on ne peut pas retourner tab qui est une variable local
}

int *correct(int n)
{
    int *tab;
    tab = (int *)malloc(sizeof(int) * n);

    for (int i = 0; i < n; i++)
    {
        cin >> tab[i];
    }
    return tab;
}

int *mauvais2(int *&tab)
{
    int *tab = new int[MAX];
    for (int i = 0; i < MAX; i++))
        cin >> tab[i]

    return tab;
}