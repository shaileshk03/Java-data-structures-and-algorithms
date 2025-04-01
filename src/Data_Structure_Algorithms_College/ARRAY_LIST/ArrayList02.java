package Data_Structure_Algorithms_College.ARRAY_LIST;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Shailesh
 */
public class ArrayList02 {

    // Q1 Find maximum using ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);
        int max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){
           /* if(max < list.get(i)){
                max = list.get(i);
            }*/
            //OR
         max = Math.max(max, list.get(i));
        }
        System.out.println("Max element =" + max);

        // Sorting
        System.out.println("All list : " + list);
        Collections.sort(list);
        System.out.println("list after sorting :"+ list);
        // List will be sort in reversed order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("reverse order: " + list);
    }
}
