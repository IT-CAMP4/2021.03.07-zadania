import java.util.Random;

public class Zadanie62 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        tab[0] = new Random().nextInt(101);

        for(int i = 1; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100 - tab[i-1]) + tab[i-1];
            System.out.print(tab[i] + " ");
        }
    }
}
