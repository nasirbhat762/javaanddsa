public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data); // creates a node with data and next = null
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        Node currNode = head;
        if (head == null) {
            head = newNode;
            return;
        }

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node currNode = head;
        head = currNode.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        if (head.next == null) {
            head = null;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;

        while (lastNode.next != null) {

            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;

        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("am"); // am
        list.addFirst("i"); // i am
        list.addLast("a"); // i am a
        list.addLast("linked list"); // i am a linked list
        list.print();
        System.out.print("null");
        list.deleteFirst(); // am a linked list
        list.deleteFirst(); // a linked list
        System.out.println();
        list.print();
        System.out.println();
        list.deleteLast(); // a
        list.print();

    }
}
