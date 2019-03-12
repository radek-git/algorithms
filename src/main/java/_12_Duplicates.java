import java.util.HashMap;
import java.util.Map;

public class _12_Duplicates {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 1};

        System.out.println(duplicates(array));

    }


    public static int duplicates (int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i : array){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                count++;
            }
        }
        return count;
    }
}
