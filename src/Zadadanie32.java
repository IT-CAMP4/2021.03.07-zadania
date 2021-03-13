import java.util.Random;

public class Zadadanie32 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        //generowanie tablicy
        for(int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(101);
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        int[] rev = new int[tab.length];
        for(int i = 0; i < rev.length; i++) {
            rev[i] = tab[tab.length - 1 - i];
            System.out.print(rev[i] + " ");
        }
    }
}
