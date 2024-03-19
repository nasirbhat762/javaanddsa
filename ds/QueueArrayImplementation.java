public class QueueArrayImplementation {

    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;

        public Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            if (rear == -1) {
                System.out.print("queue is empty");
                return true;
            } else {
                return false;
            }
        }

        // enqueue
        public static void add(int data) {
            rear++;
            arr[rear] = data;
        }

        // dequeue
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int element = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return element;
        }

        // peak
        public static int peak() {
            int element = arr[0];
            return element;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(5); // 5
        q.add(4); // 5 4
        q.add(3); // 5 4 3
        q.add(1); // 5 4 3 1
        System.out.println(q.peak()); // 5
        q.remove(); // 4 3 1
        System.out.println(q.peak()); // 4
        q.remove(); // 3 1
        System.out.println(q.peak()); // 3

    }
}
// add operation takes O(1) time 
// peak and remove operation takes O(n) time 