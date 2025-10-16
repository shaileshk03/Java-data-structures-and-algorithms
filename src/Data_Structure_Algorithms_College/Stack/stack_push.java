package Data_Structure_Algorithms_College.Stack;

import java.util.Stack;

/**
 * @author Shailesh
 */
public class stack_push {


    public static void pushAtBottom(Stack<Integer> stack, int data){
        // Based case to
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        // removed all the element present in stack
        int top = stack.pop();
        // Now push to bottom of stack the element
        pushAtBottom(stack, data);
        // Now push the data that we removed from the stack
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Method will take arg as
        pushAtBottom(stack, 4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
