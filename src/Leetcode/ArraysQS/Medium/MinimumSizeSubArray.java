package Leetcode.ArraysQS.Medium;

/**
 * @author Shailesh
 */
public class MinimumSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
      for (int i = 0; i < n; i++){
          if(nums[i] == target){
              return 1;
          } else {
            int temp  = nums[i] + nums[i+1];
             if(temp == target){
                 return 2;
             }
          }
      }
     return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        MinimumSizeSubArray minimumSizeSubArray = new MinimumSizeSubArray();
        System.out.print(minimumSizeSubArray.minSubArrayLen(target, nums));
    }
}
