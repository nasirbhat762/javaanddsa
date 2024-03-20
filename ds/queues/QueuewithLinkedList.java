public class QueuewithLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

  static  class Queue {
        static Node head;
        static Node tail;

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static void remove(){
            if(head == null){
                return;
            }

            head = head.next;
        }

        public static int peek(){
            return head.data;
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(5);
        q.add(4);
        q.add(3);
        q.add(6);
        q.remove();
        q.remove();
        q.remove();

        System.out.println(q.peek());


    }
}
