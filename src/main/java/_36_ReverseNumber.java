public class _36_ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(228));
    }

    public static int reverseNumber(int n) {
        int reverseNumber = 0;
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            reverseNumber = reverseNumber * 10 + digit;

            // System.out.println(reverseNumber);
            n = n / 10;
        }
        return reverseNumber;
    }
}
