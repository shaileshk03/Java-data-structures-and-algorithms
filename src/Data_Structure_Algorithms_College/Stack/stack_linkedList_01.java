package Data_Structure_Algorithms_College.Stack;

import java.util.Stack;

/**
 * @author Shailesh
 */
public class stack_linkedList_01 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

     public static class stack{
       static Node head = null;

       public static boolean isEmpty(){
           return head == null;
       }

       public void push(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
           head = newNode;
        }
        newNode.next = head;
        head = newNode;
       }

       public static int pop(){
           if (isEmpty()){
               return -1;
           }
           int top = head.data;
           head = head.next;
           return top;
       }

       public static int peek(){
           if(isEmpty()){
               return -1;
           }
           return head.data;
       }
     }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
