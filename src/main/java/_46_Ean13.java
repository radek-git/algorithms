public class _46_Ean13 {

    public static void main(String[] args) {
        String ean = "657483926374";

        int k = sumOfNumbersOnOddIndex(ean) * 3;

        int p = sumOfNumbersOnEvenIndex(ean);


        System.out.println(checkSum(ean));

    }




    public static int sumOfNumbersOnOddIndex(String string) {
        int suma = 0;
        char[] charArray = string.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i = i - 2) {
            suma = suma + Character.getNumericValue(string.charAt(i));
        }
        return suma;

    }

    public static int sumOfNumbersOnEvenIndex (String string) {
        int suma = 0;
        for (char c : string.toCharArray()) {
            suma = suma + Character.getNumericValue(c);
        }
        return suma - sumOfNumbersOnOddIndex(string);

    }


    public static int checkSum(String string) {
        int sum = (sumOfNumbersOnOddIndex(string)*3) + sumOfNumbersOnEvenIndex(string);
        sum = sum % 10;
        sum = 10 - sum;

        return sum;
    }
}
