public class _42_SpinWords {

    public static void main(String[] args) {

        System.out.println(spinWords("Gwidon idzie wyrzucić śmiecie i zapalić faja"));
    }


    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < words.length ; k++) {
            if (words[k].length() > 4) {
                sb.append(new StringBuilder(words[k]).reverse().toString() + " ");

            } else {
                sb.append(words[k] + " ");
            }
        }
        return sb.toString();
    }

}
