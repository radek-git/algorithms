import java.util.Scanner;

public class _50_SitoEratostenesa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] array = new int[m+1];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        array[0] = -1;
        array[1] = -1;

        for (int i = 2; i <= Math.sqrt(m); i++) {
            for (int j = 2 * i; j < array.length; j+=i) {
                array[j] = -1;
            }

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                System.out.print(array[i]+" ");
            }
        }

        System.out.println();

        // - - - -


        boolean[] tab = new boolean[m + 1];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = true;
        }

        tab[0] = false;
        tab[1] = false;

        for (int i = 2; i <= Math.sqrt(m); i++) {
            for (int j = 2 * i; j < tab.length; j+=i) {
                tab[j] = false;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != false) {
                System.out.print(i +" ");
            }
        }


    }



}
