import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        /*
        Mamy tablicę losowych liczb. Znajdź nawiększą liczbę w tablicy oraz pozycję tej liczby (index).
         */

        int[] tab = new int[50];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(101);
        }

        System.out.println("Wylosowana tablica:");
        for(int element : tab) {
            System.out.println(element);
        }
        System.out.println("--------------------------");

        int max = tab[0];
        int maxIndex = 0;
        for(int i = 1; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
                maxIndex = i;
            }
        }

        System.out.println("Największa liczba: " + max);
        System.out.println("Index największej liczby: " + maxIndex);
    }
}
