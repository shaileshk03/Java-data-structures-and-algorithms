package Leetcode_Solved.ArraysQS.Medium;

/**
 * @author Shailesh
 */
public class FindMinimum {

    // How to find minimum value in an array

    public int findMin(int[] nums) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i< nums.length; i++){
            if(nums[i] < smallest)
                smallest = nums[i];
        }
        return smallest;
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};
        FindMinimum s = new FindMinimum();
        System.out.println(s.findMin(arr));
    }
}
