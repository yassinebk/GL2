
class TestParcoursTableau {
    public static void main(String[] args) {
        ParcoursTableau Objet1 = new ParcoursTableau(100);

        Objet1.remplir();
        Objet1.affiche();
        System.out.println("max:"+  Objet1.max());
        System.out.println("min:"+Objet1.min());
        System.out.println("somme: "+Objet1.somme());
        System.out.println("moyenne:"+Objet1.moyenne());
        System.out.println("recherche:"+Objet1.recherche(1));
      
    }
}
