package exerciceone; 


static class TestParcoursTableau{
    public static void main() {
        ParcoursTableau Objet1 = new ParcoursTableau(100);
        
        System.out.println(Objet1.affiche());
        System.out.println(Objet1.recherche(5));
        System.out.println(Objet1.somme());
        System.out.println(Objet1.moyenne());
        System.out.println(Objet1.max());
        System.out.println(Objet1.min());

        
    } 
}
