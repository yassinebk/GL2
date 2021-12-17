public class Compte {

private double solde ;

public void setSolde(double newSolde){ this.solde = newSolde; }
public double getSolde(){return this.solde;}
public void crediter(double x){ solde += x; }
}
