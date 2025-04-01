package Data_Structure_Algorithms_College.DIVIDE_CONQUER;

/**
 * @author Shailesh
 */
public class DivideNConquer {
    // Merge Sorting *****
    public static void mergerSorting(int[] arr, int start_index, int end_index){
        // base case
        if(start_index >= end_index){
            // if my si and ei is equal than we don't need to do anything
            return;
        }
        // work
        int mid = start_index + (end_index - start_index)/2; // we can calculate as (si+ei)/2
        mergerSorting(arr, start_index, mid); // Left part
        mergerSorting(arr, mid+1, end_index); // right part (Start mid + 1 )
        merge(arr, start_index, mid, end_index);
    }

    public static void merge(int[] arr, int start_index, int mid, int end_index){
        // calculation
        // left (0, 3) = 4 elements, right (4,6) = 3 -> total array size is 7, (last index is 6 - 0 = 6+1)
      int[] temp = new int[end_index-start_index+1];
      int i = start_index; // Iterator for left part iteration
      int j = mid+1; // Iterator for mid part
      int k = 0; // Iterator for temp

        while (i <= mid && j <= end_index){
            // If my left side arrays is less than right side
            if(arr[i] <= arr[j]){
                // Store the elements in temp
                temp[k] = arr[i];
                // Increase the index for next elements compare
                i++;
            } else {
                // If left side element is not small add element from right side
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left if some elements remaining
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end_index){
            temp[k++] = arr[j++];
        }

      // copy temp to original
      for (k=0, i=start_index; k< temp.length; k++, i++){
          arr[i] = temp[k];
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      int[] arr = {6,3,9,5,2,8};
      mergerSorting(arr, 0, arr.length-1);
      printArray(arr);
    }
}
