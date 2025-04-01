package Leetcode_Solved.ArraysQS;

/**
 * @author Shailesh
 */
public class MajorityElements {

    public int majorityElementsCount(int[] nums){
       // Get length of array
        int n = nums.length;

        // Iterate over all element of array
        for (int i = 0; i<n; i++){
            int count = 0;
           // Iterate over next elements of array
            for(int j = 0; j < n; j++){
                // compare if 1st element and 2nd element in array are equals
                if (nums[i] == nums[j])
                    // Increase the counter
                  count++;
            }
            if (count > (n/2))
               return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,6};
        MajorityElements ml = new MajorityElements();
        int count = ml.majorityElementsCount(nums);
        System.out.println(count);
    }
}
