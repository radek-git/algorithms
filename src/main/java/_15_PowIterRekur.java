public class _15_PowIterRekur {

    public static void main(String[] args) {

        System.out.println(powIter(2,4));

        System.out.println(powRekur(2,4));

    }

    public static int powIter (int number, int pow){
        int result = 1;

        while (pow > 0){
            result = result * number;
            pow--;
        }
        return result;
    }

    public static int powRekur (int number, int pow){
        if (pow == 0) return 1;

        return number * powRekur(number, --pow);
    }
}
