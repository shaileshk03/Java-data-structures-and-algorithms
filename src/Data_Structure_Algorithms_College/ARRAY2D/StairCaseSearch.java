package Data_Structure_Algorithms_College.ARRAY2D;

/**
 * @author Shailesh
 */
public class StairCaseSearch {

    public static boolean staircaseSearch(int[][]matrix, int key){
        int row = 0, col = matrix[0].length-1;

        while (row < matrix.length && col >= 0){
             if(matrix[row][col] == key){
                 System.out.println("found key at (" + row + "," + col + ")");
                 return true;
             } else if (key < matrix[row][col] ) {
                 col--;
             } else {
                 row++;
             }
        }
     return false;
    }

    public static void main(String[] args) {

    }
}
