package APNA_COLLEGE.ARRAY2D;

import java.util.Scanner;

/**
 * @author Shailesh
 */
public class TWO_D_ARRAY {

    public static void countRepetedNumbers(int[][] matrix, int key){
        int count = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i<n; i++){
            for (int j =0; j<m; j++){
                if(matrix[i][j] == key){
                    // Count++ will count the result as how many 7 are there in the given array
                    count++;
                }
            }
        }
        System.out.print(count + " ");
    }

    public static void main(String[] args) {
     int[][] matrix = {{4,7,8},{8,8,7}};
     int key = 7;
        countRepetedNumbers(matrix, key);
    }
}
