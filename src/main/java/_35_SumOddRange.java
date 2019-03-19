public class _35_SumOddRange {

    public static void main(String[] args) {

        int start = 5;
        int end = 12;

        System.out.println(sumOdd(start, end));
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
