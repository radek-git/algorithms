import java.util.HashMap;
import java.util.Map;

public class _26_MaxCharInString {

    public static void main(String[] args) {

        String str = "asdfggfda";

        System.out.println(maxCharInString(str));
    }


    public static char maxCharInString (String str){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        char maxKey = (char) map.keySet().toArray()[0];
        int maxValue = (int) map.values().toArray()[0];

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
