package Leetcode_Solved;

/**
 * @author Shailesh
 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            // First loop to iterate through the values of array
            for(int i = 0; i < nums.length; i++){
                // Second loop will check i + 1 values
                for(int j = i + 1; j < nums.length; j++){
                    // Condition to check if two indexes values are equals to the target
                    if (nums[i] + nums[j] == target){
                        // return new int array with index of i and j.
                        return new int[]{i,j};
                    }
                }
            }
            return null;
        }

        public static void main(String[] args){
            int[] nums = {2,7,11,15};
            int target = 9;
            TwoSum sol = new TwoSum();
            System.out.println(sol.twoSum(nums, target));
        }
    }
