public class _18_Abba {

    public static void main(String[] args) {

        String str = "abbaabbaaaaaaaabbbbbaabba";
        System.out.println(abba(str));

    }

    public static int abba (String str){
        int count = 0;
        for (int i=0; i<=str.length()-4; i++){
            if((str.charAt(i) == 'a') &&
                    str.charAt(i+1) == 'b' &&
                    str.charAt(i+2) == 'b' &&
                    str.charAt(i+3) == 'a'
            ) count++;
        }

        return count;
    }
}
