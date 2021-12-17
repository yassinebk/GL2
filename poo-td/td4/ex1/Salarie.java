public abstract class Salarie{
    Salarie(double salaire){
        setSalaire(salaire);
    }
    
    private double salaire; 
    public void setSalaire(double salaire){ this.salaire=salaire;}
    public double getSalaire(){return this.salaire;}
    public abstract void verserSalaire();
}
