import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Mamy tablicę liczb. Wypisuyjemy na ekranie tylko parzyste liczby z tej tablicy
         */

        int[] tab = new int[1000];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(101);
        }

        System.out.println("Wylosowana tablica :");
        for (int element : tab) {
            System.out.println(element);
        }
        System.out.println("---------------------------------------------------");

        /*for(int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0) {
                System.out.println(tab[i]);
            }
        }*/

        int counter = 0;
        for(int elementTablicy : tab) {
            if(elementTablicy % 2 != 0) {
                continue;
            }
            System.out.println(elementTablicy);
            counter++;
        }

        System.out.println("Ilosc: " + counter);
    }
}
