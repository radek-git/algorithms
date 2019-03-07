public class _10_binarySearch {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15};

        System.out.println(contains(array, 9));

    }


    public static boolean contains (int[] array, int n){
        int start = 0;
        int end = array.length-1;
        int center;

        while (start <= end){
            center = start + (end - start) / 2;
            if (n > array[center]){
                start = center + 1;
            } else if (n < array[center]){
                end = center - 1;
            } else {
                return array[center] == n;
            }
        }
        return false;
    }
}
