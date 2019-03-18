public class _31_Maskify {

    public static void main(String[] args) {

        String s = "5555555555523";

        System.out.println(maskify(s));
    }



    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        return result + str.substring(str.length()-4);
    }
}
