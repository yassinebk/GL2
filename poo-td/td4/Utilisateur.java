public class Utilisateur extends Personne{
    private Profil profile ;
    private String login ; 
    private String password; 
    private String service;

    Utilisateur(Profil profil , String login , String password,String service )
    {
        //super("default","default","default@default")
        this.login =login ; 
        this.password =password; 
        this.service=service;
        this.profile= profil;
    }

    public double calculerSalire(){
        this.salaire=this.salaire*1.1;
        return this.salaire;
    }

    public void afficher(){ 
        System.out.print( "login: "+this.login+"   password: "+this.password+"   service"+this.service+"   Profil: "+profile.toString());
        
        super.afficher();

    }


    
}
