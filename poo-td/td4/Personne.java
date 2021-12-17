public class Personne {
    protected int id ;
    protected String nom ; 
    protected String prenom ;
    protected String mail ;
    protected String telephone ;
    protected double salaire; 


    public double calculerSalaire(){ 
        return salaire;
    }

    public void afficher(){ 
        System.out.println( "ID: "+id+"   prenom: "+prenom+"   nom: "+nom +"   mail:"+mail+"   telephone"+telephone+"   salaire"+salaire);
    }
    
}
