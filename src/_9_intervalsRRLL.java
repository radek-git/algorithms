public class _9_intervalsRRLL {
    public static void main(String[] args) {

        String str = "RRRRRLLLLRLRLRLRLRLLLLRRRRRRL";

        System.out.println(intervals(str));

    }

    public static int intervals (String str){
        int countR = 0;
        int countL = 0;
        int intervals = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'R') countR++;
            else {
                countL++;
            }
            if (countL == countR ) intervals++;
        }
        return intervals;

    }
}
