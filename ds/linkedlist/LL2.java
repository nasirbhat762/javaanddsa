import java.util.LinkedList;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // five main default functions
        // 1.addFirst()
        // 2.addLast()
        // 3.removeFirst()
        // 4.removeLast()
        // 5.size()

        list.addFirst("am");
        list.addFirst("i");
        list.addLast("a");
        list.add("linked list"); // alternative of add last

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("null");
        System.out.println();
        list.removeFirst(); // or just remove()
        list.removeLast();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("null");

        // remove at particular index 
        // list.remove(index);
    }
}
