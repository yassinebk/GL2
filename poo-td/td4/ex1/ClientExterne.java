public class ClientExterne implements IClient{

    private Compte compte ;
    public Compte creerCompte(){
        compte = new Compte();
        return compte;
    }
    
}
