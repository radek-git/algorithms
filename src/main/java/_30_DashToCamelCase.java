import org.apache.commons.lang3.text.WordUtils;

public class _30_DashToCamelCase {


    public static void main(String[] args) {
        String str = "the- stealth -    warrior";

        System.out.println(toCamelCase(str));
    }



    static String toCamelCase(String s){
        String str = WordUtils.capitalize(s.replace("-", " ")).replace(" ", "");

        return str;
    }
}
