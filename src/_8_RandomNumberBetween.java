import java.util.concurrent.ThreadLocalRandom;

public class _8_RandomNumberBetween {
    public static void main(String[] args) {

        int m = 0;
        int n = 4;

        System.out.println(randomNumberBetween(m,n));

    }

    public static int randomNumberBetween (int m, int n){
        return ThreadLocalRandom.current().nextInt(m, n + 1);
    }
}
