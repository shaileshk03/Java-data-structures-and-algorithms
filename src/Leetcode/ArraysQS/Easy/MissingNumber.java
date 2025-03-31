package Leetcode.ArraysQS.Easy;

/**
 * @author Shailesh
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n;
        for (int i = 0; i<n; i++){
            // Learn XOR BitMask chapter of apna college.
          result ^= i ^ nums[i];
        }
     return result;
    }

    public static void main(String[] args) {
    int[] nums = {9,6,4,2,3,5,7,0,1};
     System.out.println(missingNumber(nums));
    }
}
