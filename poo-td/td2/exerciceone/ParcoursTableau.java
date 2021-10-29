import java.util.Random;
import java.lang.Math;

class ParcoursTableau {
    private int[] tab;

    ParcoursTableau(int n) {
        tab = new int[n];
    }

    void remplir() {
        Random random = new Random();
        for(int i=0;i<100;i++){
            tab[i] =random.nextInt(100);
            //System.out.println(i+'\t');
        }
      
    }

    float moyenne() {
        int sum = somme();
        return (sum / tab.length);
    }

    int somme() {
        int sum = 0;
        for (int i : tab) {
            sum += i;
        }
        return sum;
    }

    int max() {
        int max = tab[0];
        for (int i : tab) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    int min() {
        int min = tab[0];
        for (int i : tab) {
            if (i > min) {
                min = i;
            }
        }
        return min;
    }

    int recherche(int e){
        
        for(int i=0;i<tab.length;i++){
            if(tab[i]==e) return i;
        }
        return -1;
    }

    void affiche(){ 
        for(int i =0;i<tab.length;i++){
            System.out.printf("%d \t",tab[i]);
        }
    }
}
