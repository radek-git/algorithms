public class _16_IsPalindrome {

    public static void main(String[] args) {

        String str = "Anna";

        System.out.println(isPalindrome(str));

    }


    public static boolean isPalindrome (String str){
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();

        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString().equals(str);
    }
}
