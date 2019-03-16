public class _28_EqualsSidesOfArray {

    public static void main(String[] args) {

        int[] tab = {1, 2, 2,1};

        System.out.println(findEvenIndex(tab));
    }


    public static int findEvenIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int center = 0;
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            center = start + (end - start) / 2;
        }
        System.out.println("center: "+center);

        for (int i = 0; i < center ; i++) {
            sumLeft = sumLeft + arr[i];
        }
        System.out.println("sumLeft: "+sumLeft);

        for (int i = center + 1; i < arr.length ; i++) {
            sumRight = sumRight + arr[i];
        }
        System.out.println("sumRight: "+sumRight);

        if ((center % 2 == 0) && (sumLeft == sumRight)) {
            return center;
        }

        return -1;

    }
}
