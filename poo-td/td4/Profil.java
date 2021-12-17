public class Profil {
    private int id; 
    private String code; 
    private static int nbProfil; 
    private String libelle ; 
    Profil ( String code , String libelle){ 
        this.id =++nbProfil; 
        this.code = code; 
        this.libelle = libelle;
    }

    public String toString(){ 
        return "id:"+id+"   code:"+code+"   libelle"+libelle;
    }
    
}
