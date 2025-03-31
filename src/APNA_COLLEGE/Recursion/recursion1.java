package APNA_COLLEGE.Recursion;


/**
 * @author Shailesh
 */
public class recursion1 {
    // Print factorial of N

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int f_n_minus1 = factorial(n-1);
        int f_n = n * (factorial(n-1));
        return f_n;
    }


    // Calculate some of N numbers
    public static int calNsum(int n){
        if (n == 0){
            return 1;
        }
        int fn_min1 = calNsum(n-1);
        int fn = n + fn_min1;
        return fn;
    }

    // Fabonacci serial print
    public static int fabonacci(int n){
        if (n==0 || n == 1){
            return n;
        }
        int getFirstNum = fabonacci(n-1);
        int getSecondNum = fabonacci(n-2);
        int fab = getFirstNum + getSecondNum;
        return fab;
    }

    // Check array is sorted using recursion
    public static boolean isSorted(int[] arr, int i){
        if (i == arr.length-1){
           return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }



    // Find first occurance of element in an array
    // In an array suppose if 5 repeated two times we need to get the first index of 5

    public static int findFirstOccurance(int[] nums, int i, int key){
        // Base case
        if (i == nums.length)
            return -1;

      // If found key return index
        if(nums[i] == key){
          return 1;
        }
        return findFirstOccurance(nums, key, i+1);
    }


    // Get last occurance

    public static int lastOccurance(int[] nums, int key, int i){
        if (i == nums.length){
            return -1;
        }
        int isFound = lastOccurance(nums, key, i+1);
        if(isFound == -1 && nums[i] == key){
            return i;
        }
        return isFound;
    }

    // Calculate power of X
    public static int calPower(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * calPower(x, n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int i = 0;
        int key = 5;
        lastOccurance(arr, i, key);
    }
}
