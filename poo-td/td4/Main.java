public class Main {
   public static void main(String[] args) {
      Profil[] profils= new Profil[5] ;

      profils[0]=new Profil("CP","Chef de Projet");
      profils[1]=new Profil("MN","Manager");
      profils[2]=new Profil("DP","Directeur de projet");
      profils[3]=new Profil("DRH","Directeur des ressources humaines");
      profils[4]=new Profil("DG","Directeur general");
      Utilisateur[] u = new Utilisateur[6] ;
      u[0] = new Utilisateur(profils[0],"Hakari","Matata","Naarach");
      u[1] = new Utilisateur(profils[1],"Matsura","Kafka","Naarach");
      u[2] = new Utilisateur(profils[2],"Nawakri","Kimoto","Naarach");
      
      for(int i=0;i<3;i++){
          u[i].afficher();
      }
   } 
    
}
