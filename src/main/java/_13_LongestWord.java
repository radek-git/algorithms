public class _13_LongestWord {

    public static void main(String[] args) {

        String str = "gwidon puszcza pawia";
        System.out.println(longesrWord(str));

    }


    public static String longesrWord (String str){
        String[] words = str.split(" ");
        String longestWord = words[0];

        for(int i=0; i<words.length; i++){
            if(words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}
