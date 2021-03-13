import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = new Random().nextInt(101);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        int rowNumber = 1;
        for(int[] row : tab) {
            int max = row[0];
            for (int i = 1; i < row.length; i++) {
                if(row[i] > max) {
                    max = row[i];
                }
            }
            System.out.println("Największa liczba rzędu " + rowNumber++ + ": " + max);
        }

    }
}
