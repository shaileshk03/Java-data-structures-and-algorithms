package Data_Structure_Algorithms_College.ArraysQs;

/**
 * @author Shailesh
 */
public class Largest_number {
    public static int getLarget(int[] number){

        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i< number.length; i++){
            if(largest < number[i])
            largest = number[i];

            if(smallest > number[i])
                smallest = number[i];
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
     int[] arr = {10, 20, 30, 40, 50};
     int largest_number = getLarget(arr);
     System.out.println("Largest number is : " + largest_number);
    }
}
