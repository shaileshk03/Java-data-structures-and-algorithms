package Leetcode_Solved.Daily_Challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shailesh
 */
public class Tuple {

    public static int tupleWithSameProduct(int[] nums){
        Map<Integer, Integer> numCount = new HashMap<>();
        int n = nums.length;
        int result = 0;

       for (int i = 0; i < n; i++){
           for (int j = i+1; j < n; j++){
               int product = nums[i] * nums[j];
               // product count
               numCount.put(product, numCount.getOrDefault(product, 0) + 1);
           }
       }

       // Compute the number of valid truples
       for (int count : numCount.values()){
           if (count > 1){
               result += (count * (count - 1)/2) * 8;
           }
       }
     return result;
    }

    public static void main(String[] args) {
     int[] nums = {2,3,4,6};
     System.out.println(tupleWithSameProduct(nums));
    }
}
