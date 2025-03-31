package APNA_COLLEGE.ARRAY2D;


/**
 * @author Shailesh
 */
public class Diagonal_Sum {

    public static int diagonalSum(int[][] matrix){
        int sum = 0;

        for (int i = 0; i<matrix.length; i++){
            // Primary diagonal
            // how to calculate sum
            sum += matrix[i][i];

            // Secondary diagonal
            // How to get value of J suppose i + j = n -1; so j = n -1 -i; will be J.
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
