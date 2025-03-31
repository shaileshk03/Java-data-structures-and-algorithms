package Leetcode.ArraysQS.Easy;

/**
 * @author Shailesh
 */
public class SearchInsertPosition {

    // Approach should be start end and mid index calculation and search for the element
    public static int searchInsetionPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int mid;

        while(start < end){
          mid = start + (end - start) /2;
          if (nums[mid] == target)
             return mid;
          if(nums[mid] > target)
             end = mid - 1;
          if (nums[mid] < target)
             start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
     int[] nums = {1,3,5,6};
     int target = 5;
     System.out.println(searchInsetionPosition(nums, target));
    }
}
