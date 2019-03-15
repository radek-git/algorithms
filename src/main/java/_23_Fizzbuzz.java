public class _23_Fizzbuzz {

    public static void main(String[] args) {
        fizzBuzz(9);
        fizzBuzz(15);
        fizzBuzz(5);
    }


    public static void fizzBuzz (int n){
        if(n%3 == 0) {
            if (n % 5 == 0) {
                System.out.println("Liczba podzielna przez 3 i 5");
            } else {
                System.out.println("Liczba podzielna przez 3");
            }
        } else if (n%5 == 0){
            System.out.println("Liczba podzielna przez 5");
        }
    }
}
