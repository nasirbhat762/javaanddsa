public class CircularQueue {
    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            if (rear == -1 && front == -1) {
                return true;
            } else {
                return false;
            }

        }

        public static boolean isFull() {
            if (front == (rear + 1) % size) {
                return true;
            } else {
                return false;
            }
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println(" queue is full");
                return;
            }
            // for 1st element only
            if (front == -1) {
                front++;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int element = arr[front];
            // single element case
            if (front == rear) {
                front = rear = -1;
                return element;
            }

            front = (front + 1) % size;

            return element;

        }

        public static int peak() {
           if(isEmpty()){
            return -1;
           }
           else{
            return arr[front];
           }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(6);

        q.add(5);
        q.add(4);
        q.add(3);
        q.add(6);
        q.add(5);
        q.add(4);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.add(3);
        // q.add(6);

        // q.remove();

        System.out.println(q.peak());

    }
}
// all operations take O(1) time  in case of circular queue