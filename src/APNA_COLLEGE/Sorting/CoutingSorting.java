package APNA_COLLEGE.Sorting;

/**
 * @author Shailesh
 */
public class CoutingSorting {


   // Counting sort used when there is small data like student marks for max 100 students or 30.
   // Frequency count
   // Counting sort will be used for Positive numbers
    public static void countSort(int[] arr){
       // MIN possible value will be assign to the large value at the first
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
           // Now largest value will be updated in the loop with Math.max method.
            largest = Math.max(largest, arr[i]);
        }

        // largest+1 because we are starting value from zero.
        int[] count = new int[largest+1];
        for (int i = 0; i < arr.length; i++){
            // update arr[i]++
            // learn here
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            //
            while (count[i] > 0){
                arr[j] = j;
                j++;
                count[i]--;
            }
        }
    }


    public static void countSortingDesendingOrder(int[] arr){
      int largest = Integer.MAX_VALUE;

      for (int i = 0; i < arr.length; i++){
          largest = Math.max(largest, arr[i]);
      }


    }


    public static void PrintArr(int[] arr){
        for (int i = 1; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        countSort(arr);
        PrintArr(arr);
    }
}
