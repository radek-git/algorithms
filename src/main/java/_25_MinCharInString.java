import java.util.HashMap;
import java.util.Map;

public class _25_MinCharInString {


    public static void main(String[] args) {

        String str = "asdfggfda";
        System.out.println(minCharInString(str));
    }

    public static char minCharInString (String str){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        char minKey = (char) map.keySet().toArray()[0];
        int minValue = (int) map.values().toArray()[0];

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() < minValue){
                minValue = entry.getValue();
                minKey = entry.getKey();
            }
        }
        return minKey;
    }
}
