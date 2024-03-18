import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);

        s.pop();

        System.out.println(s);
        System.out.println(s.peek());
    }
}
