
class TestParcoursTableau {
    public static void main(String[] args) {
        ParcoursTableau Objet1 = new ParcoursTableau(100);

        Objet1.remplir();
        Objet1.affiche();
        System.out.println(Objet1.max());
        System.out.println(Objet1.min());
        System.out.println(Objet1.somme());
        System.out.println(Objet1.moyenne());
        System.out.println(Objet1.recherche(1));
      
    }
}
