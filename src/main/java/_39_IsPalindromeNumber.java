public class _39_IsPalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isNumberPalindrome(121));
    }


    public static boolean isNumberPalindrome(int number) {
        int num = number;
        int reverse = 0;
        int lastDigit = 0;

        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number/10;
            System.out.println(reverse);
        }
        return num == reverse;
    }
}
