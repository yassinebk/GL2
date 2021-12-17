public class ClientInterne extends Salarie implements IClient{
    private Compte compte; 
    ClientInterne(double salaire){ 
        super(salaire);
    }
    public Compte creerCompte(){
        this.compte = new Compte();
        return compte;
    }
    public void verserSalaire(){
        compte.crediter(getSalaire());
    }
    
}
