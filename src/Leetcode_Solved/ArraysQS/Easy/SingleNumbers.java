package Leetcode_Solved.ArraysQS.Easy;

/**
 * @author Shailesh
 */
public class SingleNumbers {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num: nums){
            // Search about this and learn it and use this in atleast 5 programs.
            ans ^= num;
        }
        return ans;
    }

    public static void main(String [] args){
        int[] nums = {4,1,2,1,2};
        SingleNumbers sn = new SingleNumbers();
        System.out.println(sn.singleNumber(nums));
    }
}
