package Arrays.Array_InterviewQuestion;

/**
 * @author Shailesh
 */
public class Move_ArrayElements {


    //Move all zeros in an array to the end.
    //Example: Arr[] = {1,0,7,0,4,0,5,0} → Output: [1,7,4,5,0,0,0,0]
    // How to shift value to the left
    // Interview Questions

    public static int[] pushZerosToEnd(int[] arr) {
        int j = -1;
        // Place the J pointer to the end
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        // no non zero element
        if(j== -1) return arr;

        for (int i = j+1; i< arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    return arr;
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    // Second approcach
    public static void moveAllZeroToEnd(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                // what is here going on
                arr[count++] = arr[i];
            }
        }
        // Do research what is here going on
        while (count < arr.length){
            arr[count++] = 0;
        }
    }


    // Move all Zero to Star or Front
    // Approach Step by step
    // Traverse the array arr[] from the end and find the index of last zero in the arr[], store it in a variable say end.
    // Now, start traversing from end-1 to 0.
    // While traversing, if the element in the array arr[] is not equal to zero, swap it with arr[end].
    // After swapping, decrement the value of end.
    // Repeat the above steps till we have traversed all the elements from end to 0.

   public static int[] moveAllZeroToStar(int[] arr){
        int n = arr.length;;
        int end = -1;

       // find the index of last zero
        for (int i= n-1; i >= 0; i--){
            if(arr[i] == 0){
                end = i;
                break;
            }
        }

       // Modifying the array by traversing from end-1 to 0 means from back to start
       for (int i = end -1; i >= 0; i--){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
       }
     return arr;
   }



    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
       // moveAllZeroToEnd(arr);
        moveAllZeroToStar(arr);
        printArr(arr);
        }
}