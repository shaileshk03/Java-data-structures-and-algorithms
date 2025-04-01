package Leetcode_Solved.ArraysQS.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Shailesh
 */
public class CheckDuplicates {

    //  Given array check if any value appears at least twice in the array return true else return false if every element is distinct.
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        // enhanced loop
        for (int num: nums){
            if(!set.add(num)){
              return true;
            }
        }
    return false;
    }

    public static void main(String[] args) {
     int [] nums = {1,2,3,1};
     CheckDuplicates checkDuplicates = new CheckDuplicates();
        System.out.println(checkDuplicates.containsDuplicate(nums));
    }
}
