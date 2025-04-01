package Data_Structure_Algorithms_College.ArraysQs;

/**
 * @author Shailesh
 */
public class MaxSubArray {

    // Brute force method
    public static void getMaxSum(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i<=nums.length; i++){
            int start = i;

            for (int j = i; j <=nums.length; j++){
                int end = j;

                currSum = 0;

                for(int k = start; k<end; k++){
                    // add values to current sum (** See how to add values for future uses)
                    currSum += nums[k];
                }
                System.out.println("Current sum " + currSum);
                // If current sum value is bigger than max then will store current sum value to max
                if(maxSum < currSum)
                  // store the value of current sum to max sum
                   maxSum = currSum;
            }
            System.out.println("Max sum" + maxSum);
        }
    }

    // *** Prefix method to get max of sum array
    // Learn how to create Prefix in this program
   public static void getMaxSumPrefixMethod(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Create Prefix
        int[] prefix = new int[nums.length];
        // Prefix of zero
        prefix[0] = nums[0];

       // calculate prefix
       for (int i = 1; i<prefix.length; i++){
            // pahle wale prefix ka sum prefix[i-1]
            // current prefix sum nums[i]
           prefix[i] = prefix[i-1] + nums[i];
       }

       for (int i = 0; i <nums.length; i++){
           int start = i;

           for (int j = i; j <nums.length; j++){
               int end = j;

               // This line is most important how to get current sum without 3rd loop here
               currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

               System.out.println("Current sum " + currSum);

               // If current sum value is bigger than max then will store current sum value to max
               if(maxSum < currSum)
                   // store the value of current sum to max sum
                   maxSum = currSum;
           }
           System.out.println("Max sum" + maxSum);
       }
   }


   // Kedanes algorithm
   public static void kedanes(int[] nums){
      int maxSum = Integer.MIN_VALUE;
      int currentSum = 0;

      for (int i =0; i < nums.length; i++){
          currentSum = currentSum + nums[i];

          if (currentSum < 0)
              currentSum = 0;

          maxSum = Math.max(currentSum, maxSum);
      }
       System.out.print("Our max sum is : " + maxSum);
   }


   public static void kedanesForNegativeNum(int[] nums){
       int maxSum = Integer.MIN_VALUE;
       int currentSum = 0;

       for (int value : nums) {
           currentSum = Math.max(value, currentSum + value);
           maxSum = Math.max(maxSum, currentSum);
       }
       System.out.print("max sum = : " + maxSum);
   }

    public static void main(String[] args) {
     int[] nums = {2,4,6,8,10};
     int[] numbers = {-2, -3, -4, -1, -2, -1, -5, -3};
        kedanesForNegativeNum(numbers);
    }
}
