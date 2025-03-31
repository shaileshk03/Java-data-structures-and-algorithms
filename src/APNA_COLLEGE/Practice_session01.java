package APNA_COLLEGE;

import java.util.Scanner;

/**
 * @author Shailesh
 */
 // Prime number and Even off number
public class Practice_session01 {


    static boolean arraySortedOrNot(int[] arr, int n){
        // Array has one or no element
        if (n == 0 || n == 1)
           return true;
        for (int i = 1; i < n; i++){
            if (arr[ i - 1] > arr[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
        if (arraySortedOrNot(arr, n)){
            System.out.print("Yes\n");
        } else {
            System.out.print("NO\n");
        }
    }

}
