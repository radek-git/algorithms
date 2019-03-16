import java.util.Map;

import static java.util.Map.entry;

public class _29_ArrayToDecimalNumber {

    public static void main(String[] args) {

        int[] array = {1,1, 1, 1,};

        String number = arrayToString(array);

        System.out.println(toDec(2, number));


    }



    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();


        for (int i : array) {
            sb.append(i);
        }
        return sb.toString();
    }


    public static int toDec(int system, String s) {
        Map<Character, Integer> map = Map.ofEntries(
                entry('0', 0), entry('1', 1), entry('2', 2),
                entry('3', 3), entry('4', 4), entry('5', 5),
                entry('6', 6), entry('7', 7), entry('8', 8),
                entry('9', 9), entry('A', 10), entry('B', 11),
                entry('C', 12), entry('D', 13), entry('E', 14),
                entry('F', 15)
        );

        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            sum += map.get(s.charAt(i)) * Math.pow(system, s.length() - 1 - i);
        }
        return sum;

    }
}
