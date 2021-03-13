import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++) {
            int wylosowana;
            while (true) {
                wylosowana = new Random().nextInt(101);
                if(wylosowana % 7 == 0) {
                    break;
                }
            }

            tab[i] = wylosowana;
            System.out.print(tab[i] + " ");
        }
    }
}
