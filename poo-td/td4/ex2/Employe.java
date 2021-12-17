public class Employe extends Personne{
   protected double salaire;
   
   Employe(double salaire,String nom ,String prenom){
       super(nom,prenom);
       setSalaire(salaire); }
   public void setSalaire(double salaire){ this.salaire=  salaire; }
   public double getSalaire(){return this.salaire;}
   public String toString(){ 
       return "salaire:"+this.salaire+"\t"+ super.toString() ;
   }
}
