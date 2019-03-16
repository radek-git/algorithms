import java.util.ArrayList;
import java.util.List;

public class _32_FindOutlier {

    public static void main(String[] args) {


        int[] evens = {2, 4, 0, 100, 4, 11, 2602, 36};
        int[] odds = {160, 3, 1719, 19, 11, 13, -21};

        System.out.println(find(evens));
        System.out.println(find(odds));

    }


    static int find(int[] integers){

        int result = 0;
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int i : integers) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        if (evens.size() > odds.size()) {
            result += result + odds.get(odds.size() -1);
        } else {
            result += result + evens.get(evens.size() - 1);
        }


        return result;
    }
}
