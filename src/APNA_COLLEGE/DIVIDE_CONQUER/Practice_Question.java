package APNA_COLLEGE.DIVIDE_CONQUER;

import java.sql.SQLOutput;

/**
 * @author Shailesh
 */
public class Practice_Question {

    // Question 1: Merge sort of an array of string
 /*   public int removeDuplicates(int[] nums) {
    }*/
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        // Loop through all the numbers in the array
        for (int num : nums) {
            // Continue if the number is already identified as one of the maxima
            if (num == firstMax || num == secondMax || num == thirdMax) {
                continue;
            }

            // Update the maxima if the current number is greater than the first maximum
            if (num > firstMax) {
                thirdMax = secondMax; // the old secondMax becomes the new thirdMax
                secondMax = firstMax; // the old firstMax becomes the new secondMax
                firstMax = num;       // assign the current number to firstMax
            }
            // Update the second and third maxima if the current number fits in between
            else if (num > secondMax) {
                thirdMax = secondMax; // the old secondMax becomes the new thirdMax
                secondMax = num;      // assign the current number to secondMax
            }
            // Update the third maximum if the current number is greater than thirdMax
            else if (num > thirdMax) {
                thirdMax = num;       // assign the current number to thirdMax
            }
        }

        // Return the third max if it's different from the initial value; otherwise, return the first max
        return (int) (thirdMax != Long.MIN_VALUE ? thirdMax : firstMax);
    }

    public static void main(String[] args){
        int[] nums = {1,1,2};
        Practice_Question practiceQuestion = new Practice_Question();
        practiceQuestion.thirdMax(nums);
    }
}
