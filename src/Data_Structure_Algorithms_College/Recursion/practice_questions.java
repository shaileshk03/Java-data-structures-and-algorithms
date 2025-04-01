package Data_Structure_Algorithms_College.Recursion;

/**
 * @author Shailesh
 */
public class practice_questions {

    // Question - 1
     public static void findOccurance(int[] arr, int key, int i){
         // base case
        if (i == arr.length)
            return;
         if (arr[i] == key)
             System.out.print(i + " ");
        findOccurance(arr, key, i+1);
     }


     // Question - 2
    static String[] digits = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
     public static void printDigits(int number){
         if(number == 0){
             return;
         }
         // Why we are taking last digit
         int lastDigit = number%10;
         System.out.println("------------------");
         // what number /10 will do
         printDigits(number/10);
         System.out.print(digits[lastDigit]+ " ");
     }

    public static void main(String[] args) {
       /*  int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
         int key = 2;
         int i =0;
        findOccurance(arr, key, i);*/

        printDigits(1234);
    }
}
