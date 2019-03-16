import org.apache.commons.lang3.text.WordUtils;

public class _30_DashToCamelCase {


    public static void main(String[] args) {

        String str = "the-stealth-warrior";

        System.out.println(toCamelCase(str));
    }



    static String toCamelCase(String s){
        String str = WordUtils.capitalize(s.replace('-', ' '));
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length ; i++) {
            sb.append(words[i]);
        }

        return sb.toString();

    }
}
