package Leetcode_Solved.ArraysQS.Medium;

/**
 * @author Shailesh
 */
public class Find_PeakElement {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = (left+right)/2;
            // compare the elements
            if(nums[mid] > nums[mid+1]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // return left if the right is equals to.
        return left;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        Find_PeakElement sol = new Find_PeakElement();
        System.out.print(sol.findPeakElement(nums));
    }
}
