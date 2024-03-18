public class StackImplementationLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // push function
    public  void push(String data){
         Node newNode = new Node(data);
         Node currNode = head;
         if(head == null){
            head = newNode;
            return;
         }

         newNode.next = currNode;
         head = newNode;

    }

    public String pop(){
        String top = head.data;
        if(head == null){
            return "empty list";
        }
        Node currNode = head;
        head = currNode.next;

        return top;
    }

    public void display(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode  = currNode.next;
        }
    }

    public static void main(String[] args) {
      StackImplementationLinkedList stack = new StackImplementationLinkedList();

      stack.push("5");
      stack.push("4");
      stack.push("2");

      stack.pop();
      stack.pop();
      stack.display();
    }
}
