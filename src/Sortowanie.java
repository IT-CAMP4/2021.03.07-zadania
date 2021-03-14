import java.util.Random;

public class Sortowanie {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(101);
            System.out.print(tab[i] + " ");
        }

        while (true) {
            boolean wasSwitch = false;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int pom = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = pom;
                    wasSwitch = true;
                }
            }
            if (!wasSwitch) {
                break;
            }
        }

        System.out.println();
        System.out.println("Posortowana tablica: ");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
