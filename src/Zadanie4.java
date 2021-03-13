import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = - new Random().nextInt(101);
            System.out.print(tab[i] + " ");
        }
    }
}
