public class Professeur  extends Employe{
    private String specialite;

    public String getSpecialite(){
        return this.specialite;
    }

    public Professeur(String specialite,double salaire,String nom , String prenom){ 
        super(salaire,nom,prenom);
        this.specialite=specialite;
    }

    public String toString() {
        return "specialite: "+this.specialite+"\t"+super.toString();
    }


    
}
