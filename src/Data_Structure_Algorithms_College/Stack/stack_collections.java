package Data_Structure_Algorithms_College.Stack;

import java.util.Stack;

/**
 * @author Shailesh
 */
public class stack_collections {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
