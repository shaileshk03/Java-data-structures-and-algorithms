package Data_Structure_Algorithms_College.ArrayLists;

import java.util.ArrayList;

/**
 * @author Shailesh
 */
public class PairSum {

    // Brute force
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        for (int i=0; i<list.size(); i++){
            for (int j= i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target){
                   return true;
                }
            }
        }
     return false;
    }

    // Two pointer approach
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int lp = 0;
        int lr = list.size()-1;
        while (lp != lr){
            // case 1
            if(list.get(lp) + list.get(lr) == target){
                return true;
            }
            // case 2
            if(list.get(lp) + list.get(lr) < target){
                lp++;
            } else {
              // case 3
                lp--;
            }
        }
      // if still not get condition true return false
      return false;
    }

    // Two pointer in rotated and unsorted array
    public static boolean pairSum3(ArrayList<Integer> list, int target){
        int breakPoint = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++){ // breaking point
            if(list.get(i) > list.get(i+1)){
                breakPoint = i;
                break;
            }
        }

        int left_pointer = breakPoint + 1; // smallest
        int right_pointer = breakPoint;   // largest

        while (left_pointer != right_pointer){
            // case1
            if(list.get(left_pointer) + list.get(right_pointer) == target){
                return true;
            }

            if (list.get(left_pointer) + list.get(right_pointer) < target){
               left_pointer = (left_pointer+1) % n;
            }

            if (list.get(left_pointer) + list.get(right_pointer) > target){
                right_pointer = (n + right_pointer-1) % n;
            }
        }

      return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
    }
}
