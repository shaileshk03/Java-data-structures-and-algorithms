package Data_Structure_Algorithms_College.LinkedLists;
/**
 * @author Shailesh
 */
public class LinkedList01 {
  public static class Node{
      int data;
      Node next;

      // Constructor
      public Node(int data){
         this.data = data;
         this.next = null;
      }
   }

   public static Node head;
   public static Node tail;

   // Add
   public void addFirst(int data){

       // step1 create new node
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }

       // step2  newNode next = head
       newNode.next = head; // link

       // step3 - head = newNode
       head = newNode;
   }

   public void addLast(int data){
       // step1 create new node
       Node newNode = new Node(data);

       if (head == null){
           head = tail = newNode;
           return;
       }
       // steps2 tail next points to newNode
       tail.next = newNode;

       // step3 tail = newNode
       tail = newNode;
   }

   public void print(){
       if(head == null){
           System.out.println("LL is empty");
           return;
       }

       Node temp = head;
       while (temp != null){
           System.out.println(temp.data+ "");
           temp = temp.next;
       }
       System.out.println();
   }

    public static void main(String[] args) {
        LinkedList01 ls = new LinkedList01();
        ls.print();
        ls.addFirst(2);
        ls.print();
        ls.addFirst(1);
        ls.print();
        ls.addLast(3);
        ls.print();
        ls.addLast(4);
    }
}
