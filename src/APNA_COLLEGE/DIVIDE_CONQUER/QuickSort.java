package APNA_COLLEGE.DIVIDE_CONQUER;

/**
 * @author Shailesh
 */
public class QuickSort {

    public static void printArray(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int start_idx, int end_idx){
        // base case
        if(start_idx >= end_idx){
            return;
        }

         // Find out pivot -> last element index
        // Now partition so based on that element will be sorted
        // last element
        int pivot_idx = partition(arr, start_idx, end_idx);

        // One Important thing to remember about is pointer kept to index -1
        // Iterator will be kept -1 index out of array
        quickSort(arr, start_idx, pivot_idx-1); // left
        quickSort(arr, pivot_idx+1, end_idx); // right
    }

    public static int partition(int[] arr, int si, int ei){
        // last element
      int pivot = arr[ei];
      int i = si-1; // to make space for elements smaller than pivot at -1 index

      for (int j = si; j <ei; j++){
          // compare array j is less than pivot
          // small elements are identified
          if(arr[j] <= pivot){
            // Create space by increment
            i++;
            // swap
           int temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
          }
      }
      // now put pivot to right place because it will be in middle of array to separate elements
      // swap
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // Remember this line (DON"T write pivot = arr[i], pivot is a variable, we need to change inside array a pivot element)
        arr[i] = temp;
       return i;
    }

    public static void main(String[] args) {
     int[] arr = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        System.out.print("Array after sorting :");
        printArray(arr);
    }
}
