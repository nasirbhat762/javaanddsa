public class ReverseLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add element in the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add element at the last
    public void addLast(String data) {
        Node newNode = new Node(data);
        Node currNode = head;
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }

    // remove element from the beginning
    public void removeFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        head = currNode.next;
    }

    // remove element from the last
    public void removeLast() {
        Node lastNode = head.next;
        Node secondLastNode = head;
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

    }

    // this method removes the element from nth position from the last
    public void remove(int n) {
    
       int size = 0 ; // variable to calculate the size of LL
       Node currNode = head;

       while(currNode != null){
        currNode = currNode.next;
        size++;
       }

    //    now position of element from the start is (size - last + 1)
      int position = size - n + 1; // 7- 2 + 1 = 6
      int indexOfReqNode = position - 1 ; // 5
      currNode = head ;
      for(int i = 1; i< indexOfReqNode; i++){
         currNode = currNode.next;
      }
      currNode = currNode.next.next;
    }

    // reverse a linked list
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = prev.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            // update (mtlb prev ko curr kardo aur curr ko next kardo)
            prev = curr;
            curr = next;
            // this loop will reverse the LL now we need to point the head at last element

        }
        head.next = null;
        head = prev;

    }

    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("list is empty");
        }
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addFirst("4"); // 4
        list.addFirst("3"); // 3 4
        list.addFirst("2"); // 2 3 4
        list.addFirst("1"); // 1 2 3 4
        list.addLast("5"); // 1 2 3 4 5
        list.addFirst("0"); // 0 1 2 3 4 5
        list.addLast("6"); // 0 1 2 3 4 5 6
        // list.removeFirst(); // 1 2 3 4 5 6
        // list.removeFirst(); // 2 3 4 5 6
        // list.removeLast(); // 2 3 4 5
        // list.removeLast(); // 2 3 4
        // list.reverse(); // 4 3 2
        // Q:- remove the element from LL nth position from last where n is always > 1
        // and less than LL size
        // list.remove(2);
        
        list.printList();
        if (list.head != null) {
            System.out.print("null");
        }

    }
}
