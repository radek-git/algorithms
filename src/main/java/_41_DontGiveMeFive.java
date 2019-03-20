import java.util.ArrayList;
import java.util.List;

public class _41_DontGiveMeFive {


    public static void main(String[] args) {

        System.out.println(dontGiveMeFive(2,9));



    }

    public static int dontGiveMeFive(int start, int end) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        sum = list.stream().mapToInt(Integer::intValue).sum()-5;

        return sum;
    }






}
