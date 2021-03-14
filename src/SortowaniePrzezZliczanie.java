import java.util.Random;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] tab = new int[10];

        System.out.println("Nieposortowana tablica: ");
        for(int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(101);
        }
        /*tab[0] = 10;
        tab[9] = 10;*/

        for(int element : tab) {
            System.out.print(element + " ");
        }

        int[] elementCounts = new int[101];

        for (int element : tab) {
            elementCounts[element] += 1;
        }

        int emptyElement = 0;
        int[] sortedTab = new int[tab.length];
        for(int i = 0; i < elementCounts.length; i++) {
            for(int j = 0; j < elementCounts[i]; j++) {
                sortedTab[emptyElement++] = i;
            }
        }

        System.out.println();
        System.out.println("Posortowana tablica:");
        for(int element : sortedTab) {
            System.out.print(element + " ");
        }
    }
}
