package Data_Structure_Algorithms_College.LinkedLists;

import java.awt.*;

/**
 * @author Shailesh
 */
public class Linked_List_01 {

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
   public static int size;

   // Add
   public void addFirst(int data){
       // step1 create new node
        Node newNode = new Node(data);
        size++;
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
       size++;
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
           System.out.print(temp.data + "->");
           temp = temp.next;
       }
       System.out.println();
   }

   // Add
    public void add(int idx, int data){
       // if operation is to add List in first
       if(idx == 0){
           addFirst(data);
           return;
       }

      Node newNode = new Node(data);
       size++;
      Node temp = head;
      int i = 0;

      while (i < idx-1){
          temp = temp.next;
          i++;
      }

      // i = idx -1; temp -> prev
     newNode.next = temp.next;
      temp.next = newNode;
    }

    // Remove first
    public int removeFirst(){
       // base case
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size ==1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
       head = head.next;
       return val;
    }


    public static void main(String[] args) {
        Linked_List_01 ls = new Linked_List_01();
        ls.addFirst(2);
        ls.addFirst(1);
        ls.addLast(3);
        ls.addLast(4);
        ls.add(2, 3);

        ls.print();
        System.out.println("Size of LinkedList is : " + ls.size);

        ls.removeFirst();
        ls.print();
    }
}
