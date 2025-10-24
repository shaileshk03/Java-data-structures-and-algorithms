package Data_Structure_Algorithms_College.Queue;

import java.util.*;

/**
 * @author Shailesh
 */
public class queue_collection_fram {

    public static void main(String[] args) {
     // Queue is an interface in a collection framework, and it is implemented by LinkedList or ArrayDeque classes.
     Queue<Integer> queue = new LinkedList<>();
     queue.add(1);
     queue.add(2);
     queue.add(3);
     queue.add(4);

     while (!queue.isEmpty()){
         System.out.println(queue.peek());
         queue.remove();
     }
    }
}
