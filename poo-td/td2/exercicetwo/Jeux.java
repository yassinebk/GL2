import java.util.Random;
import java.util.Scanner;

class Jeux {
    int[] tab;
    int lastInsertedNumber;
    boolean gameState;

    Jeux() {
        tab = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            tab[i] = random.nextInt(100000);
        }
        int lastInsertedNumber = insertNumber();
        for (int i = 0; i < tab.length; i++) {
            gameState = tab[i] == lastInsertedNumber;
        }
        gameResult();
    }

    int insertNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserer un entier");
        int returnNumber = scanner.nextInt();
        scanner.close();
        return returnNumber;
    }

    void gameResult() {
        System.out.println(gameState ? "Vous avez gagnez" : "vous avez perdu");
    }

}
