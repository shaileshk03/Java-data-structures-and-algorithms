package Data_Structure_Algorithms_College.Stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Shailesh
 */
public class stack_arraylist_01 {

   public static class stack{
       static ArrayList<Integer> list = new ArrayList<>();
       static boolean isEmpty(){
           return list.size() == 0;
       }

       // add data in stack
       public void push(int data){
           list.add(data);
       }

       // Delete
       // Store the data & delete it so we required int type to store
       public static int pop(){
           if(isEmpty()){
               return -1;
           }
        // top is the last value of ArrayList
           int top = list.get(list.size()-1);
           list.remove(list.size()-1);
           return top;
       }

       public static int peek(){
           if(isEmpty()){
               return -1;
           }
           return list.get(list.size()-1);
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
