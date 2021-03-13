import java.util.Random;

public class Zadanie9 {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];

        for(int i = 0; i < tab.length; i++) {
            tab[i][0] = new Random().nextInt(91);
            for(int k = 1; k < tab[i].length; k++) {
                while (true) {
                    tab[i][k] = new Random().nextInt(101);
                    int sum = 0;
                    for(int j = 0; j <= k; j++) {
                        sum += tab[i][j];
                    }
                    double avr = ((double) sum) / ((double) k + 1);

                    if(avr <= 45.0) {
                        break;
                    }
                }
            }
        }

        for(int[] row : tab) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
