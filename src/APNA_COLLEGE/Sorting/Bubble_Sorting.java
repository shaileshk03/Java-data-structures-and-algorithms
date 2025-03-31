package APNA_COLLEGE.Sorting;

/**
 * @author Shailesh
 */
public class Bubble_Sorting {

    // It works well with large datasets
    // where the items are almost sorted because it takes only one iteration to detect whether the list is sorted or not.
    // This algorithm is fastest on an extremely small or nearly sorted set of data.

    public static void bubbleSorting(int[] arr){

        // outter loop
        for (int turn = 0; turn < arr.length-1; turn++){
          int swap = 0;
            //inner loop
            // Should understand arr.length-1-turn
            // So arr.length -1 will iterate over all element but last two element after sorting all element no need to sort last two.
            // They will be sorted for example 1,2,3 we don't need to check 4 and 5 because they will be already sorted so we are using this term.
            for (int j = 0; j < arr.length-1-turn; j++){
                int count = 0 ;
                // check condition if zero th element is
                if (arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                swap++;
            }
            if (swap == 1)
                break;
        }
    }
     // method for print the array
    public static void printArr(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // bubble sorting desending order
    public static void bubbleSortingDecendingOrder(int[] arr){
        //Create int swap
        int swap = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++){
            swap = 0;

            // Loop will run till the last two elements in last.
            for (int j = 0; j < arr.length-1-i; j++){
                // this condition will reverse the array to desending order
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if (swap == 1)
              break;
        }
    }

    public static void main(String[] args) {
        int[] arr ={3,2,1,4,5};
        bubbleSortingDecendingOrder(arr);
        printArr(arr);
    }
}
