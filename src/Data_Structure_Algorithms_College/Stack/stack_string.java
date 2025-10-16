package Data_Structure_Algorithms_College.Stack;

import java.util.Stack;

/**
 * @author Shailesh
 */
public class stack_string {
    public static String reverseString(String str){
        Stack<Character>  stack = new Stack<>();
        int index = 0;

        // clear your concept here how push each char inside Stack
        while (index < str.length()){
            stack.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            char ch = stack.pop();
            result.append(ch);
        }

        str = result.toString();
        return str;
    }

    public static void main(String[] args) {

    }
}
