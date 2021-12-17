public class Main {
    public static void main(String[] args) {
        Personne[] P = new Personne[6];
        
       P[0]= new Etudiant(1001,"Ahmed","Baka");
       P[1]= new Etudiant(1002,"Amir","Dhaka");
       P[2]= new Employe(40.0,"Khalil","Raha") ;
       P[3]= new Employe(50.0,"Chakir","Raha") ; P[4]= new Professeur("Biologie",50.0,"Samir","Hamza");
       P[5]=new Professeur("Mecanique",100.0,"Safa","karib");

       for(int i=0;i<5;i++){
           System.out.println(P[i]);
       }

       System.out.println("Program finished execution, Good bye ! ");
    }
    
}
