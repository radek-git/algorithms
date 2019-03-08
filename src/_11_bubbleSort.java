import java.util.Arrays;

public class _11_bubbleSort {

    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 3};

        array = bubble(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] bubble (int[] array){
        int temp = 0;

        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
