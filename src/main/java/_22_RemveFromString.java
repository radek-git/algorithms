public class _22_RemveFromString {

    public static void main(String[] args) {

        String str = "koń";
        String sub = "o";

        System.out.println(removeFromString(str, sub));

    }

    public static String removeFromString (String str, String sub){
        return str.replace(sub, "");
    }
}
