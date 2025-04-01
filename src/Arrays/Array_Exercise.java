package Arrays;

/**
 * @author Shailesh
 */
public class Array_Exercise {


    //This method used to add new element in old array
//  public static int[] addX(int n, int[] arr, int x){
//      // Create a new Int array and increase the size of array by + 1.
//      int[] newArr = new int[n + 1];
//      // Run a for loop til the length of number.
//      for(int i = 0; i <n; i++ )
//          // assign all the old array value to new created arr.
//          newArr[i] = arr[i];
//         // insert the new value the new created array.
//          newArr[n] = x;
//         // return the value.
//      return newArr;
//  }

    public static int[] twoSum(int n,  int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        for(int i=0; i<nums.length; i++ ){
            for(int j = 0; j<=i; j++){
                if(nums[i] + nums[j] == target){
                 ans[0] = j;
                 ans[1] = i;
                 return ans;
                }
            }
        }
     return ans;
    }

  public static void main(String[] args) {
//      int i;
//      int n = 10;
//      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      int x = 50;
//      System.out.println("Initial Array:\n" + Arrays.toString(arr));
//      arr = addX(n, arr, x);
//      // print the updated array
//        System.out.println("\nArray with " + x
//                + " added:\n"
//                + Arrays.toString(arr));
   int n = 4;
   int target = 9;
   int[] nums = {2,7,11,15};
   int[] ans = twoSum(n, nums, target);
      System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
              + ans[1] + "]");
  }
}
