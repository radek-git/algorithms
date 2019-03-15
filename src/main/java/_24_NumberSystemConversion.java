import java.util.Map;

import static java.util.Map.entry;

public class _24_NumberSystemConversion {

    public static void main(String[] args) {

        System.out.println(decTo(8, 78));

        System.out.println(decTo1(16,78));

        System.out.println(toDec(8,"116"));

        System.out.println(convertFromSystemToSystem(16, 2, "777"));





    }

    public static String convertFromSystemToSystem(int fromSystem, int toSystem, String str){

        return decTo(toSystem, toDec(fromSystem, str));

    }


    public static String decTo (int system, int n){
        char[] array = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'  };

        StringBuilder sb = new StringBuilder();

        while (n > 0){
            sb.append(array[n % system]);
            n = n / system;
        }

        return sb.reverse().toString();
    }


    public static String decTo1 (int system, int n) {
        char[] array = new char[] {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'
        };

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(array[n % system]);
            n /= system;
        }

        return sb.reverse().toString();
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

        for (int i=s.length() - 1; i >= 0; i--) {
            sum += map.get(s.charAt(i)) * Math.pow(system, s.length() - 1 - i);
        }

        return sum;
    }
}
