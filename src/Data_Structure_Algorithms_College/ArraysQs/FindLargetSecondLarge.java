package Data_Structure_Algorithms_College.ArraysQs;

/**
 * @author Shailesh
 */
public class FindLargetSecondLarge {

    // program is basically to clear the concept to get the largest, second largest
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
        //return (int) (secondLargest != Long.MIN_VALUE ? secondLargest : firstLargest);
        //return (int) (firstLargest != Long.MIN_VALUE ? firstLargest : firstLargest);
    }
    public static void main(String[] args) {
        int[] numbers = {5, 13, 41, 88, 99, 77};
        FindLargetSecondLarge largetSecondLarge = new FindLargetSecondLarge();
        int max_third = largetSecondLarge.thirdMax(numbers);
        System.out.println(max_third);
    }
}
