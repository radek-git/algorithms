public class _21_LongestBlock {

    public static void main(String[] args) {


    }


    public static int longestBlock (String str){
        int max = 0;
        int blockLength = 1;

        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i) != str.charAt(i+1) || i == str.length()-2){
                if (i == str.length()-2) blockLength++;

                if (blockLength == max){
                    max = blockLength;
                }

                blockLength = 1;
            } else {
                blockLength++;
            }
        }
        return max;
    }
}
