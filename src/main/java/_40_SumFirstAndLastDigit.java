public class _40_SumFirstAndLastDigit {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(123));
    }


    public static int sumFirstAndLastDigit(int number) {
        if (number == 0) return 0;

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;

        }

        return firstDigit + lastDigit;
    }
}
