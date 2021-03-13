import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        //generowanie tablicy
        for(int i = 0; i < tab.length; i ++) {
            tab[i] = new Random().nextInt(101);
        }

        //wypisywanie tablicy
        for (int element : tab) {
            System.out.println(element);
        }

        //liczenie średniej
        int sum = 0;
        double avr;

        for (int element : tab) {
            sum += element;
        }

        avr = ((double) sum) / ((double) tab.length);

        System.out.println(avr);
    }
}
