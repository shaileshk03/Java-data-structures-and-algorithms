package Data_Structure_Algorithms_College.Linked_Lists;

/**
 * @author Shailesh
 */
public class Doubly_LinkedList_01 {
    public static class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
           head = tail = newNode;
           return;
        }

        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public static int removeFirst(int data){

        if(head == null){
            System.out.println("DLL is empty!");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
          int val = head.data;
          head = tail = null;
          size--;
          return val;
        }

        int val = head.data;
        head = head.next;
        head.previous = null;
        size--;
        return val;
    }

    public static void main(String[] args) {

    }
}
