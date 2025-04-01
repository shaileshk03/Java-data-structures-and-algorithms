package Data_Structure_Algorithms_College.DIVIDE_CONQUER;

/**
 * @author Shailesh
 */
public class SortedRotated_Array {

   public static int search(int[] arr, int target, int si, int ei){
      // Base case
       if(si > ei){
         return -1;
      }
      // Get mid
       int mid = (si+ei)/2;

     // case Found if mid is target
     if(arr[mid] == target){
         return mid;
     }

     // mid on L1
     if(arr[si] < arr[mid]){
           //case a : left
         if(arr[si] <= target && target <= arr[mid]){
            return search(arr, target, si, mid);
         } else{
             // case b : right
             return search(arr, target, mid+1, ei);
         }
     }
     // mid on L2
       else {
           // case c : right
         if(arr[mid] <= target && target <= arr[ei]){
             return search(arr, target, mid+1, ei);
         } else {
             // case d : left
             return search(arr, target, si, mid-1);
         }
     }
   }

    public static void main(String[] args) {
     int[] nums = {4,5,6,7,0,1,2,3};
     int target = 0;
     int targetIdx = search(nums, target, 0, nums.length-1);
        System.out.println(targetIdx);
    }
}
