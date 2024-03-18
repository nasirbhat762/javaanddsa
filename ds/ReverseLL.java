
// jugadu method 
import java.util.LinkedList;

public class ReverseLL {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("2");
        list.addLast("5");
        list.addLast("7");
        list.addLast("3");
        list.add("4");

        LinkedList<String> rList = new LinkedList<>();
        for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
            rList.add(j, list.get(i));
        }
        list = rList;
        System.out.println(list);

    }
}
