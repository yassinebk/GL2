public class Personne {

    protected int id ;
    protected String nom ; 
    protected String prenom ; 
    private static int nmbrePersonnes; 

    public Personne(String nom , String prenom)  {
        this.id= ++nmbrePersonnes;
        this.nom = nom ;
        this.prenom = prenom;
    }
    public String toString(){ return "Personne:"+"#id: "+ id +"\t nom: "+this.nom +"\t prenom:"+this.prenom +"\n"; }
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    public void setnom(String nom){ this.nom= nom ; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    public int getId(){ return this.id; }
  
    
}
