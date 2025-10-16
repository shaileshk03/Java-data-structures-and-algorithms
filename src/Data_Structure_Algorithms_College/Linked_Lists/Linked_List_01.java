package Data_Structure_Algorithms_College.Linked_Lists;

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
       // step1 create new node object using new keyword
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

       // Node object created initialized data
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

    // Remove Last
    public int removeLast(){
       if(size == 0){
           System.out.println("LL is empty");
           return Integer.MIN_VALUE;
       } else if (size == 1){
           int val = head.data;
           head = tail = null;
           size = 0;
           return val;
       }

       // prev (second last) = i size-2
        Node prev = head;
        for (int i = 0; i<size-2; i++){
           prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Iterative Search
    public int IterSearch(int key){
       Node temp = head;
       int i = 0;

       while (temp != null){
           if(temp.data == key){
              return i;
           }
          temp = temp.next;
          i++;
       }

       // key not found
       return i--;
    }


    // helper function
    public int helperFun(Node head, int key){
       if(head == null){
           return -1;
       }
       if(head.data == key){
           return 0;
       }

       int idx = helperFun(head.next, key);
       if(idx ==-1){
         return -1;
       }

       return idx+1;
    }
    public int RecSearch(int key){
       return helperFun(head, key);
    }

    // Reverse LinkedList
    public void reverseLinkedList(){
      Node prev = null;
      Node current = tail = head;
      Node next;

      while (current != null){
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
      // update head
     head = prev;
   }

   public void deleteNthFromEnd(int n){
       // calculate size
       int size = 0;
       // temp pointing to head
       Node temp = head;

       while(temp != null){
         temp = temp.next;
           size++;
       }

       if(n == size){
        head = head.next; // Remove first
        return;
       }

       // size-n
       int i = 1;
       int iTOFind = size - n;
       Node prev = head;

       while(i < iTOFind){
         prev = prev.next;
         i++;
       }

       prev.next = prev.next.next;
       return;
   }

   //Find the Middle of the LinkedList (slow fast approach)
   public Node findMid(Node head){
       Node slow = head;
       Node fast = head;

       while(fast != null && fast.next != null){
         slow = slow.next; // 1
         fast = fast.next.next; // 2
       }
      return slow; // slow is my midNode
   }

   public boolean checkPalindrome(){
       if(head == null || head.next == null){
           return true;
       }

       // step1 - Find middle
        Node midNode = findMid(head);

       // step2 - reverse 2nd half
        Node prev = null;
        Node current = midNode;
        Node next;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node right = prev;
        Node left = head;

        // step3 - check left half and right half
       while (right != null){
           if(left.data != right.data){
             return false;
           }
          left = left.next;
          right = right.next;
       }
     return true;
   }

   private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;

    while(fast != null && fast.next != null){
     slow = slow.next;
     fast = fast.next.next;
    }
    return slow;
   }

   private Node merge(Node head1, Node head2){
     Node mergeLL = new Node(-1);
     Node temp = mergeLL;

     while (head1 !=null && head2 !=null){
         if(head1.data <= head2.data){
           temp.next = head1.next;
           head1 = head1.next;
           temp = temp.next;
         } else {
             temp.next = head2.next;
             head2 = head2.next;
             temp = temp.next;
         }
     }
     while (head1 != null){
         temp.next = head1.next;
         head1 = head1.next;
         temp = temp.next;
     }

     while (head2 != null){
         temp.next = head2.next;
         head2 = head2.next;
         temp = temp.next;
     }
     return mergeLL.next;
   }

   public Node mergeSort(Node head){
       // Base Case
       if(head == null || head.next == null){
         return head;
       }

       Node mid = getMid(head);
       Node rightHead = mid.next;
       mid.next = null;
       Node newLeft = mergeSort(head);
       Node newRight = mergeSort(rightHead);
       return merge(newLeft, newRight);
   }

    public static void main(String[] args) {
        Linked_List_01 ls = new Linked_List_01();
        ls.addFirst(2);
        ls.addFirst(1);
        ls.addLast(3);
        ls.addLast(4);
        ls.addLast(5);

        //merge sort
        ls.print();
        ls.head = ls.mergeSort(ls.head);
        ls.print();

        //
        ls.add(2, 3);

        ls.print();
        System.out.println("Size of LinkedList is : " + ls.size);

        //ls.removeLast();
        //ls.print();
        //ls.reverseLinkedList();
        //ls.print();

        ls.deleteNthFromEnd(3);
        ls.print();


    }
}
