package APNA_COLLEGE.DIVIDE_CONQUER;

import java.util.ArrayList;

/**
 * @author Shailesh
 */
public class MergeSort {
   public static void printArray(int[] arr){
       for (int i = 0; i< arr.length; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2 ;
        mergeSort(arr, left, mid);  // left half
        mergeSort(arr, mid + 1, right); // right half
        merge(arr, left, mid, right);  // merging sorted halves
    }


    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Before sorting array: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sorting array: ");
        printArray(arr);
    }
}

