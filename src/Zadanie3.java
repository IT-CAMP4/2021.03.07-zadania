import java.util.Arrays;
import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        //generowanie tablicy
        for(int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(101);
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        int[] rev = new int[tab.length];
        for(int i = 0, j = rev.length - 1; j >= 0; i++, j--) {
            rev[i] = tab[j];
            System.out.print(rev[i] + " ");
        }
    }
}
