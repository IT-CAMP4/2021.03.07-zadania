import java.util.Arrays;
import java.util.Random;

public class Zadanie8 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = new Random().nextInt(101);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        double[] avrTab = new double[tab.length];
        int index = 0;
        for(int[] row : tab) {
            int sum = 0;
            for(int element : row) {
                sum += element;
            }
            double avr = ((double) sum) / ((double) row.length);
            avrTab[index++] = avr;
        }

        double max = 0.0;
        int j = 0;
        int maxIndex = 0;
        for(double element : avrTab) {
            if(element > max) {
                max = element;
                maxIndex = j;
            }
            j++;
        }
        System.out.println("Największa średnia : " + max + ", wiersz o indeksie: " + maxIndex);
    }
}
