public class Main3 {
    public static void main(String[] args) {
        /*

         */

        int[][] tab = new int[10][10];

        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i*j;
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
