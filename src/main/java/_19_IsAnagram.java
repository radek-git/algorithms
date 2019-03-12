import java.util.HashMap;
import java.util.Map;

public class _19_IsAnagram {

    public static void main(String[] args) {

        String a = "końk";
        String b = "ńok";

        System.out.println(isAnagram(a, b));

    }


    public static boolean isAnagram (String a, String b){
        if (a.length() != b.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : b.toCharArray()){
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
