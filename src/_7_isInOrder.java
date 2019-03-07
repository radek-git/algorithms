import java.util.ArrayList;

public class _7_isInOrder {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(isInOrder(list));

    }

    public static boolean isInOrder (ArrayList<Integer> numbers){
        for(int i=0; i<numbers.size()-1; i++){
            if(numbers.get(i) <= numbers.get(i+1) ){
                return false;
            }
        }
        return true;
    }
}
