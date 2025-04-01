package Data_Structure_Algorithms_College.Sorting;

/**
 * @author Shailesh
 */
public class Selection_Sorting {

    // This sorting technique will be used ONLY when the ** list is short ** and memory is less
    // Technique uses minimum number of possible sorting
    // The algorithm maintains two subarrays in a given array, the subarray which is already sorted, and the remaining subarray which is unsorted.
    // In every iteration of the selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray


    public static void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            // Let's assume the smallest element present at the current index
            int midPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
              if (arr[midPosition] > arr[j])
              {
                  midPosition = j;
              }
            }
            // swap
            int temp = arr[midPosition];
            arr[midPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
      System.out.println();
    }

    public static void selectionSortingDecendingOrd(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int midPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                // Check mid value of array to its next value is grater
                if (arr[midPos] < arr[j]) {
                    midPos = j;
                }
                //swap
                int temp = arr[i];
                arr[i] = arr[midPos];
                arr[midPos] = temp;
            }
        }
    }

    public static void main(String[] args) {
      int[] arr = {5,4,1,3,2};
        selectionSortingDecendingOrd(arr);
        printArr(arr);
    }

}
