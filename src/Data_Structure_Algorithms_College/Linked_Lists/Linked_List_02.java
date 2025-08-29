package Data_Structure_Algorithms_College.Linked_Lists;

/**
 * @author Shailesh
 */
public class Linked_List_02 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
           this.data = data;
           this.next = null;
        }
    }

     public static Node head;
     public static Node tail;
     public static int size;

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }

        // It creates a new reference temp that points to the same node as head.
        // If you want to traverse the list without modifying the original head pointer.
        Linked_List_02.Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // Detect a loop/cycle in a LL
     public static boolean isCycle(){ //
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2

            if(slow == fast){
              return true;  // cycle exists
            }
        }
       return false; // cycle doesn't exists
     }


     public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;

            if(fast == slow){
             cycle = true;
             break;
            }
        }

        if (cycle == false){
            return;
        }

        // Find meeting point
         slow = head;
         Node prev = null; // last node
         while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
         }

        // Remove cycle -> last.next = null
        prev.next = null;
     }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
    }
}
