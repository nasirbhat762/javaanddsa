import java.util.*;

public class QueueWith2Stacks {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>(); // created stack 1
        static Stack<Integer> s2 = new Stack<>(); // created stack 2

        public static void add(int data) {
            if (s1.isEmpty()) {
                s1.push(data);
                return;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());

            }

        }

        public static void remove() {
            if (s1.isEmpty()) {
                return;
            }
            s1.pop();
        }

        public static int peek() {
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(4);
        q.add(3);

        q.remove();

        System.out.println(q.peek());
    }
}
