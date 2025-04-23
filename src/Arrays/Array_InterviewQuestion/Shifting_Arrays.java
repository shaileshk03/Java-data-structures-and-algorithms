package Arrays.Array_InterviewQuestion;

import java.util.Arrays;

/**
 * @author Shailesh
 */
public class Shifting_Arrays {

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8};
       int[] arr2 = {1,2,3,4,5};

        rightShift(arr, 3);
        leftShift(arr, 3);

        rightShift(arr2, 4);
        leftShift(arr2, 4);
    }

    public static void rightShift(int[] arr, int rightShifts){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            // It will give us the right spot to a shit element based on a remainder
            int newPostion = (i + rightShifts) % arr.length;
            temp[newPostion] = arr[i];
        }
        System.out.println("----------");
        System.out.println("The array was  " + Arrays.toString(arr));
        System.out.println("The array is now  " + Arrays.toString(temp));
        System.out.println("----------");
    }

    public static void leftShift(int[] arr, int leftShifts){
        int[] temp = new int[arr.length];
        // shifting will be done from end to start so the loop will run opposite
        for (int i = arr.length-1; i >= 0; i--){
            int newPosition = (i + (arr.length - leftShifts)) % arr.length;
            temp[newPosition] = arr[i];
        }

        System.out.println("----------");
        System.out.println("The array was  " + Arrays.toString(arr));
        System.out.println("The array is now  " + Arrays.toString(temp));
        System.out.println("----------");
    }
}
