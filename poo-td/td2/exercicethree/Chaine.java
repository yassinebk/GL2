
import java.util.Scanner;

class Chaine {

    String chaine ;
    static char[] voyelle={ 
            'a','e','i','u','o',
        };
    int compteurVoyelle;
    
    Chaine(){
       insertString();
       System.out.println(calculerVoyelle());

    }

    int calculerVoyelle(){
        for(int i=0;i<chaine.length();i++){
            if(find( chaine.charAt(i))){


            }
        }
    }

    void insertString(){
        Scanner scanner = new  Scanner(System.in);
        chaine = scanner.nextLine();
    }

    boolean find(char  k) { 
        for (int i=0;i<voyelle.length;i++){
            if(k==voyelle[i])return true;
        }
        return false;
    }




}
