import java.util.HashMap;
import java.util.Map;

public class _17_CharFrequency {

    public static void main(String[] args) {

        String str = "jhdjfkhgkgkhgkhjg";

        System.out.println(charFrequency(str));

    }


    public static Map<Character, Integer> charFrequency (String str){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
