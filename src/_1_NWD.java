public class _1_NWD {

    public static void main(String[] args) {

        int a = 10;
        int b = 94;

        System.out.println(najwiekszyWspolnyDzielnik(a, b));
    }



    public static int najwiekszyWspolnyDzielnik (int a, int b){

            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }

        return a;
    }
}
