package Data_Structure_Algorithms_College.Sorting;

/**
 * @author Shailesh
 */
public class InsertionSorting {

    public static void insertionShorting(int[] arr){
      for (int i = 1; i <arr.length; i++){
          int current = arr[i];
          int previous = i -1;

          // Finding out correct position to insert.
          // Till then our previous greater than zero and arr of prev greater than current.
          // **** arr[previous] > current) condition arrange the element in assending order
          // If we need to desending order reverse this arr[previous] < current)
          while(previous >=0 && arr[previous] > current){
               // How to push element to previous until previous elements are less than current
              // Here we pushed next position of previous element.
              arr[previous+1] = arr[previous];
              previous--;
          }
          // Insertion
          arr[previous+1] = current;
      }
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionShortingDesending(int[] arr){
      for (int i = 1; i < arr.length; i++){
          int current = arr[i];
          int previous = i -1;

          while (previous >=0 && arr[previous] < current){
             arr[previous+1] = arr[previous];
             previous--;
          }

          arr[previous+1] = current;
          System.out.print(arr[previous+1] + "Inserting >>   ");
      }

    }

    public static void main(String[] args) {
    int[] arr = {5,4,1,3,2};
        insertionShortingDesending(arr);
        printArr(arr);
    }
}
