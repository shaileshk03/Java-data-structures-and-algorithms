package Leetcode_Solved.ArraysQS.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Shailesh
 */
public class ContainsDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= k)
                set.remove(nums[i - k]);
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }


    public boolean containsNearbyDuplicateII(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Use getOrDefault to find the last index of the current number.
            // If it's not found, use a default value that is far away from any possible index.
            int lastIndex = map.getOrDefault(nums[i], -1000000);

            // Check if the current index and the last index of the same value are within k steps
            if (i - lastIndex <= k) {
                // If so, we found a nearby duplicate and return true.
                return true;
            }

            // Update the map with the current value and its index for the next iteration checks
            map.put(nums[i], i);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {99, 99};
        int k = 2;
        ContainsDuplicate cod = new ContainsDuplicate();
        System.out.println(cod.containsNearbyDuplicate(nums, k));
    }

}
