public class _44_DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberFirst, double numberSecond) {
        double numberFirstA = (int) (numberFirst * 1000);
        double numberSecondB = (int) (numberSecond * 1000);
        if (numberFirstA == numberSecondB) {
            return true;
        }
        return false;
    }
}
