#ifndef ETUDIANT
#define ETUDIANT 

#include<string>


class Etudiant { 
    public:
        Etudiant(); 
        Etudiant(int nbrNotes,std::string& nom);
        ~Etudiant();
        Etudiant(const Etudiant&);
        void saisie();
        void affichage(); 
        float moyenne();
        bool admis();
        bool compare();


    private:
    static int matricule; 
    int nbrNotes; 
    std::string nom ;
    int *tabNote;

};


#endif /* ifndef Etudiant */
