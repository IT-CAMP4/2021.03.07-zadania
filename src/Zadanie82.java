import java.util.Random;

public class Zadanie82 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = new Random().nextInt(101);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        double maxAvr = 0.0;
        int maxIndex = 0;
        int index = 0;
        for(int[] row : tab) {
            int sum = 0;
            for(int element : row) {
                sum += element;
            }
            double avr = ((double) sum) / ((double) row.length);
            if(avr > maxAvr) {
                maxAvr = avr;
                maxIndex = index;
            }
            index++;
        }
        System.out.println("Największa średnia : " + maxAvr + ", wiersz o indeksie: " + maxIndex);
    }
}
