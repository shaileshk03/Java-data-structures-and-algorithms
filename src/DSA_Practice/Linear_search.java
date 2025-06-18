package DSA_Practice;

/**
 * @author Shailesh
 */
public class Linear_search {

    //Given an array, arr of n integers, and an integer element x,
    // find whether element x is present in the array.
    // Return the index of the first occurrence of x in the array,
    // or -1 if it doesn’t exist.

    // What is Linear_search
    //In Linear Search, we iterate over all the elements of the array and check if it is the current element is equal to the target element.
    // If we find any element to be equal to the target element, then return the index of the current element. Otherwise,
    // if no element is equal to the target element, then return -1 as the element is not found. Linear search is also known as sequential search.
    //For example, Consider the array arr[] = {10, 50, 30, 70, 80, 20, 90, 40} and key = 30

    public static int SearchNum(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == num)
                return i;
        }
     return -1;
    }

    public static void main(String[] args) {
     int[] arr = {5,10,15,20,30};
     int num = 10;
     int index = SearchNum(arr, num);
     System.out.println("Number Index :" + index);
    }
}
