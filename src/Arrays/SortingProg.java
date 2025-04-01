package Arrays;

/**
 * @author Shailesh
 */
public class SortingProg {
    static int[] arr = {10, 324, 45, 90, 9808};
    public static int FindMinMax(int[] arr){
     int max = arr[0];
     int min  = arr[0];

     for(int i = 0; i < arr.length; i++){
         if(arr[i] > max)
             max = arr[i];
         else if (arr[i] < min)
             min = arr[i];
     }
     System.out.println("Min number :" + min);
     return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 9808};
        System.out.println("Max number in the array is :" + FindMinMax(arr));
    }
}
