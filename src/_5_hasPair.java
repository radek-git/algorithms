public class _5_hasPair {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,0};

        System.out.println(hasPair(array, 18));

    }


    public static boolean hasPair (int[] array, int sum){
        HashSet<Integer> previous = new HashSet<>();

        for(int i : array){
            if(previous.contains(sum - i)){
                return true;
            } else {
                previous.add(i);
            }
        }
        return false;
    }
}
