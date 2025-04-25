package Data_Structure_Algorithms_College.Arrays;

/**
 * @author Shailesh
 */
public class Pairs {

    public static void printPairs(int[] numbers) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                totalPairs ++; // taking count
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + totalPairs);
    }

    public static void printSubPair(int[] nums){
        for (int i = 0; i<=nums.length; i++){
            int start = i;
            for (int j = i; j <=nums.length; j++){
                int end = j;
                for(int k = start; k<end; k++){
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        //printPairs(arr);

        printSubPair(arr);
    }
}
