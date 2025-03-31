package APNA_COLLEGE.DIVIDE_CONQUER;

import java.util.ArrayList;

/**
 * @author Shailesh
 */
public class Merge_String {

     public static void printArray(int[] arr){
         for (int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println();
     }

    public static String[] mergeSort(String[] arr, int left, int right){
         // base case
         if(left == right){
             String[] a = {arr[left]};
             return a;
         }
         // mid
        int mid = (left+right)/2;
       String[] arr1 = mergeSort(arr, left, mid);
       String[] arr2 =  mergeSort(arr, mid+1, right);
       String[] arr3= merge(arr1, arr2);
       return arr3;
    }

   // merge method
    public static String[] merge(String[] arr1, String[] arr2){
      // Get length of two arrays
      int m = arr1.length;
      int n = arr2.length;

      // create new array 3 and assign length of m+n size
        String[] arr3 = new String[m+n];

        //Start index
        int idx = 0;

        // i, j points (Iterators)
        int i = 0;
        int j = 0;

      //While loop
      while (i < m  && j < n){
          if(isAlphabeticallySmaller(arr1[i], arr2[j])){
              arr3[idx] = arr1[i];
              i++; // increase pointer
              idx++; // increase index
          } else {
              arr3[idx] = arr2[j];
              j++;
              idx++;
          }
      }
      // Shirt remaining element
      while (i < m){
        arr3[idx] = arr1[i];
        i++;
        idx++;
      }
      while (j < n){
        arr3[idx] = arr2[j];
        j++;
        idx++;
      }
    return arr3;
    }

    // Alphabetic method to check smaller alphabets
    static boolean isAlphabeticallySmaller(String str1, String str2){
         // compare the str1 with str2
         if(str1.compareTo(str2) < 0){
             return true;
         }
         return false;
    }

    public static void main(String[] args) {
        //int arr[] = {6, 3, 9, 5, 2, 8};
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] a = mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
