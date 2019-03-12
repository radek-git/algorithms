import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _14_AlphabeticalOrder {

    public static void main(String[] args) {

        String str = "jgkfdrjkhvhlj";

        System.out.println(alphabeticalOrder(str));

    }


    public static String alphabeticalOrder (String str){
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for(char c : str.toCharArray()){
            list.add(c);
        }

        Collections.sort(list);

        for( char c : list){
            sb.append(c);
        }

        return sb.toString();
    }
}
