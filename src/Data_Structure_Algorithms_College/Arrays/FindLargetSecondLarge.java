package Data_Structure_Algorithms_College.Arrays;

/**
 * @author Shailesh
 */
public class FindLargetSecondLarge {

    // the program is basically to clear the concept to get the largest, second largest and third-largest numbers
    public int thirdMax(int[] nums) {
        long firstLargest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == firstLargest || num == secondLargest || num == thirdLargest) {
                continue;
            }
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            }
            else if (num > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            }
            else if (num > thirdLargest) {
                thirdLargest = num;
            }
        }
        return (int) (thirdLargest != Long.MIN_VALUE ? thirdLargest : firstLargest);
//        return (int) (secondLargest != Long.MIN_VALUE ? secondLargest : firstLargest);
//        return (int) (firstLargest != Long.MIN_VALUE ? firstLargest : firstLargest);
    }

    // Find the Smallest Number in array
    // @param int[] numbers - short form as nums
    public static int findSmallestNum(int[] nums){
        // Let's assume  number is Max possible value
        int smallest_num = Integer.MAX_VALUE;
        // Iterate over all the elements in numbers array
        for(int num: nums){
            if(num < smallest_num){
                // update the Largest number value
               smallest_num = num;
            }
        }
        return smallest_num;
    }

    // Find the Largest Number in array
    // @param int[] numbers short form as nums
    public static int findLargest(int[] nums){
        // Let's assume number is Min possible value
        int largest_num = Integer.MIN_VALUE;
        // Iterate over all the elements in numbers array
        for(int num: nums){
            // Check if each number is greater than the element if found
            if(num > largest_num){
               // update the Largest number value
               largest_num = num;
            }
        }
        // Return the Largest number
      return largest_num;
    }

        public static int[] findMinMax(int[] arr){
            int min = Integer.MAX_VALUE;
            int mid = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;

            for(int num : arr){
                if(num > max){
                    mid = max;
                    max = num;
                }

                if(num < min){
                    min = num;
                }

                if(num > max && num != max){
                    mid = num;
                }
            }
            return new int[]{min, max};
        }


    public static void main(String[] args) {
        int[] numbers = {5, 13, 41, 88, 99, 77};
        FindLargetSecondLarge largetSecondLarge = new FindLargetSecondLarge();
        int max_third = largetSecondLarge.thirdMax(numbers);
        System.out.println(max_third);

//        int smallest = findSmallestNum(numbers);
//        int largest = findLargest(numbers);
//        System.out.println(largest);


//        int[] arr = {10, 20, 30, 40, 50};
//        int[] result = findMinMax(arr);
//        System.out.println("Mid & Max values are respectively :: " + result[0] + " & " + result[1]);
    }
}
