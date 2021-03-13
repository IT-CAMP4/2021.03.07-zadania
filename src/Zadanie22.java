import java.util.Random;

public class Zadanie22 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        int sum = 0;
        //generowanie tablicy
        for(int i = 0; i < tab.length; i ++) {
            tab[i] = new Random().nextInt(101);
            System.out.println(tab[i]);
            sum += tab[i];
        }

        double avr = ((double) sum) / ((double) tab.length);
        System.out.println(avr);
    }
}
