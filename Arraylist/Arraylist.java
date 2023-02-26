import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);

        //printing the elements
        for (int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        //another method to print numbers
        System.out.println(numbers);

        //for sorting - ascending
        Collections.sort(numbers);
        System.out.println(numbers);

        //descending order sorting
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}
