public class Etudiant extends Personne{
    private int cne; 

    Etudiant (int cne , String nom , String prenom) { 
        super(nom,prenom);
        setCne(cne);
    }
    public void setCne(int cne){ this.cne=  cne ; }
    public int getCne(){return this.cne;}
    public String toString(){ 
        return "cne:"+this.cne+"\t"+super.toString();
    }
    
}
