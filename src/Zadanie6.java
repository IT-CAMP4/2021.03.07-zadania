import java.util.Random;

public class Zadanie6 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        tab[0] = new Random().nextInt(101);

        for(int i = 1; i < tab.length; i++) {
            int losowa;

            while(true) {
                losowa = new Random().nextInt(101);
                if(losowa >= tab[i-1]) {
                    break;
                }
            }

            tab[i] = losowa;
            System.out.print(tab[i] + " ");
        }
    }
}
