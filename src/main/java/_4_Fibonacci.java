public class _4_Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibIter(8));

        System.out.println(fibRekur(8));

    }


    public static int fibIter (int index){
        int first = 1;
        int second = 1;
        int temp = 1;

        if(index == 0) return 0;
        if(index == 1) return 1;

        for(int i=2; i<index; i++){
            temp = first + second;
            first = second;
            second = temp;
        }
        return temp;
    }

    public static int fibRekur (int index){
        if(index == 0) return 0;
        if(index == 1) return 1;

        return fibRekur(index - 1) + fibRekur(index - 2);
    }
}
