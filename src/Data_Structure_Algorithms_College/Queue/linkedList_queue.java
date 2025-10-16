package Data_Structure_Algorithms_College.Queue;

/**
 * @author Shailesh
 */
public class linkedList_queue {

   static class Node{
       int data;
       Node next;

       public Node(int data){
           this.data = data;
       }
   }

   static class Queue{
       static Node head;
       static Node tail;
       static int size;

       public static boolean isEmpty(){
           return head == null && tail == null;
       }
       public void add(int data){
           Node newNode = new Node(data);
           size++;
           if(head == null){
               head = tail = newNode;
               return;
           }
           tail.next = newNode;
           tail = newNode;
       }


       public static int remove(){
         if(isEmpty()){
             System.out.println("Queue is empty");
             return-1;
         }

         int front = head.data;
         //single element
           if(head == tail){
               head = tail = null;
           } else {
               head = head.next;
           }
         return front;
       }

       public static int peek(){
           if(isEmpty()){
               System.out.println("Queue is empty");
               return -1;
           }
           return head.data;
       }
   }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
