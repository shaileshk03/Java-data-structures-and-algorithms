package Leetcode_Solved.ArraysQS.Easy;

/**
 * @author Shailesh
 */
public class ThirdMaxNumber {
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
            } else if (num > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest) {
                thirdLargest = num;
            }
        }
        return (int) (thirdLargest != Long.MIN_VALUE ? thirdLargest : firstLargest);
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        ThirdMaxNumber s = new ThirdMaxNumber();
        s.thirdMax(nums);
    }
}
