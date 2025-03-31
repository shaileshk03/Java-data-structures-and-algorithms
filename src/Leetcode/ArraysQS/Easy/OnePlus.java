package Leetcode.ArraysQS.Easy;

/**
 * @author Shailesh
 */
public class OnePlus {

    //Leet code Question 66. Plus One

//    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//    Increment the large integer by one and return the resulting array of digits.
//
//    Example 1:
//
//    Input: digits = [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
//    Incrementing by one gives 123 + 1 = 124.
//    Thus, the result should be [1,2,4].


    //n%10 means modulus of 10. This is used to get last digit.
    //n%10 means the modulus of 10, that is the remainder you get when you divide with 10. Here it is used to get each digit.

    //Example:
    //Say your number is n = 752.
    //n%10 = 2, n/10 = 75
    //So you add 2 to the sumDigits(75)
    //Now, n%10 = 75%10 = 5. This is the digit to be added and so on, till your n >= 10.
    // When it is < 10, you have a single digit that you just need to return as it is, as that is only the sum of digits in that single-digit number n.


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n -1; i >= 0; i--){
            int count = digits[i]++;
            digits[i] %=10;

            if (digits[i] != 0){
                return digits;
            }
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args){
        int[] digits = {1,2,3};
        OnePlus sol = new OnePlus();
        System.out.print(sol.plusOne(digits));
    }

}
