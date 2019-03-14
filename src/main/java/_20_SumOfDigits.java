public class _20_SumOfDigits {

    public static void main(String[] args) {

        String str = "1234";

        System.out.println(sumOfDigits(str));

        System.out.println(sumOfDigitsIter(1234));

        System.out.println(sumOfDigitsRekur(1234));

    }


    public static int sumOfDigits (String str){
        int sum = 0;

        for (char c : str.toCharArray()){
            sum = sum + Character.getNumericValue(c);
        }
        return sum;
    }

    public static int sumOfDigitsIter (int n){
        int sum = 0;

        while (n > 0){
            sum = sum + n%10;
            n/=10;
        }
        return sum;
    }


    public static int sumOfDigitsRekur (int n){

        if (n > 0){
            return n % 10 + sumOfDigitsRekur(n / 10);
        }
        return 0;
    }
}
