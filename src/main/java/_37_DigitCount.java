public class _37_DigitCount {

    public static void main(String[] args) {

        System.out.println(digitCount(10111));
    }

    public static int digitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count;
    }
}
