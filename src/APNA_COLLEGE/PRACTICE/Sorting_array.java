package APNA_COLLEGE.PRACTICE;

/**
 * @author Shailesh
 */
public class Sorting_array {
    public boolean search(int[] nums, int target) {
        int start_idx = 0;
        int end_idx = nums.length - 1;
        int mid = (start_idx + end_idx) / 2;
        if (nums[mid] == target) {
            return true;
        }

        while (start_idx < end_idx) {

            if (nums[start_idx] < nums[mid]) {
                if (nums[start_idx] < target && target < nums[mid]) {
                    end_idx = mid;
                } else {
                    start_idx = mid + 1;
                }
            } else {
                if (nums[mid] < target && target < nums[end_idx]) {
                    start_idx = mid + 1;
                } else {
                    end_idx = mid;
                }
            }

            if (nums[start_idx] == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        Sorting_array sortingArray = new Sorting_array();
        int target = 3;
        System.out.println(sortingArray.search(arr, target));
    }
}
