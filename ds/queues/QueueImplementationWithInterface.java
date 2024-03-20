import java.util.*;

public class QueueImplementationWithInterface {
    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>(); this also creates a queue
        Queue<Integer> q = new LinkedList<>();

        q.add(5);
        q.add(4);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
