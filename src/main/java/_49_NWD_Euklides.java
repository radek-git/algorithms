import java.util.Scanner;

public class _49_NWD_Euklides {


    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        a = sc.nextInt();
        System.out.println("Podaj liczbę b: ");
        b = sc.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else
                b = b - a;
        }

        System.out.println("NWD = " + a);
    }
}

