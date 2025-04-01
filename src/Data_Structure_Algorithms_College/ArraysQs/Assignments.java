package Data_Structure_Algorithms_College.ArraysQs;

import java.util.HashSet;

/**
 * @author Shailesh
 */
public class Assignments {

  // Find the largest number in given array
  // Important concept to be cleared with MIN and MAX value
  //
   // QUESTION-1
    public boolean containsDuplicates_bruteforce(int[] nums) {
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i +1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                 return true;
                }
            }
        }
      return false;
    }

    // QUESTION-1
    public boolean containsDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            } else {
               set.add(nums[i]);
            }
        }
      return false;
    }


    // QUESTION-2
    public static int returnIndex(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
      return -1;
    }

    // QUESTION-3
    public static int stockMaxProfit(int[] nums){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < nums.length; i++){
            if(buyPrice < nums[i]){
                int profit = nums[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
               buyPrice = nums[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
     int[] nums = {7, 6, 4,  3, 1};
     int target = 3;
     Assignments assignments = new Assignments();
     //System.out.println(assignments.returnIndex(nums, target));
        System.out.println(assignments.stockMaxProfit(nums));
    }
}
