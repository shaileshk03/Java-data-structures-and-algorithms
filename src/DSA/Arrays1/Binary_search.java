package DSA.Arrays1;

/**
 * @author Shailesh
 */
public class Binary_search {

    // Prerequisite 
    // Binary search will apply only on sorted elements.
    // Order can be increasing or decreasing.

    public static int binarySearch(int[] numbers, int key){
        int start = 0;
        int end = numbers.length-1;

        while (start < end){
          int mid = (start + end) / 2;

          // If Midile value of array is equals to key return it (found the ans)
          if (numbers[mid] == key){
              return mid;
          }
          // Else check on right side
          if (numbers[mid] < key){ // right
                 start = mid + 1;
          // If not check left side
          } else { // left
              end = mid - 1;
          }

        }
     return -1;
    }
    public static void main(String[] args) {
      int[] arr = {2, 4, 6, 8, 10, 12};
      int key = 10;
        System.out.println("Index for key is : " + binarySearch(arr, key));
    }
}
