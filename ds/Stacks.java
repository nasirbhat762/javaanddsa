import java.util.ArrayList;

public class Stacks {

    public void push(ArrayList stack, String data) {
        stack.add(data);
    }

    public void pop(ArrayList stack) {
        stack.remove(  stack.size()- 1);
    }

    public static void main(String[] args) {
        Stacks st = new Stacks();
        ArrayList<String> stack = new ArrayList<>();
        st.push(stack, "nasir");
        st.push(stack, "tasir");
        st.pop(stack);
        st.push(stack, "tasir");
        System.out.println(stack);
    }
}
