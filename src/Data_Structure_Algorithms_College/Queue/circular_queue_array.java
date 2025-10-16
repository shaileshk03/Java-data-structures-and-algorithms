package Data_Structure_Algorithms_College.Queue;

/**
 * @author Shailesh
 */
public class circular_queue_array {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        // constructor
        Queue(int n){
            arr = new int[n];
            size = n;
            // rear is the last element in array
            rear = -1;
            front = -1;
        }

        // Empty method to check if queue is empty
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        public static void add(int data){
            // check if Queue is full
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            // add first
            if(front == -1){
                front = 0;
            }

            // add to the last + 1, rear itself is last so and init rear with data
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            // base case
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];

            if(rear == front){
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // circular queue
        System.out.println(queue.remove());
        queue.add(4);
        System.out.println(queue.remove());
        queue.add(5);

       while (!queue.isEmpty()){
           System.out.println(queue.peek());
           queue.remove();
       }
    }


}
