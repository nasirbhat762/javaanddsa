import java.util.ArrayList;
import java.util.Collections;

class ArrayListss {
    public static void main(String[] args) {
        // creating array list
        ArrayList<Integer> list = new ArrayList<Integer>();
        

        // adding elements to the array list
        list.add(5);
        list.add(4);
        list.add(10);

        // adding elements at given index

        list.add(2, 23);

        // printing array list
        System.out.println(list);

        // getting element in array list
        int element = list.get(1);
        System.out.println(element);

        // setting element in array list
        list.set(1, 6);
        System.out.println(list);

        //removing an element
        list.remove(1);
        System.out.println(list);

        // sorting a list 
        Collections.sort(list);
        System.out.println(list);

        // calculate size of array list
        int size = list.size();
        System.out.println(size);
    }
}
