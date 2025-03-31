package APNA_COLLEGE.ArraysQs;

/**
 * @author Shailesh
 */
public class ReverseArray {
    public static void reverse(int[] numbers){
        // Create three variables First, Last and Temp
        //First will start from 0
        int first = 0;
        // Last will be the n length -1
        int last = numbers.length -1;
        // Temp is temporary variable
        int temp;

        // Make sure to use while loop first < last
        while (first < last){
            temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++;
            last --;
        }
    }

    public static void main(String[] args) {
     int [] arr = {2,4,6,8,10,12};
     reverse(arr);
     for (int i =0; i < arr.length; i++){
         System.out.print(arr[i] + " ");
     }
     System.out.print(" ");
    }
}
