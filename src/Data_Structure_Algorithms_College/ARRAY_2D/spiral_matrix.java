package Data_Structure_Algorithms_College.ARRAY_2D;

/**
 * @author Shailesh
 */
public class spiral_matrix {

    public static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol){
            // top
            // starting row print > J - Col, i - row
            for (int j = startCol; j <=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            // Right
            // all elements in row lets say ROW -> 1,2,3,4 printed we need to exclude 4 and print vertically so we will use row+1
            for (int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+ " ");
            }

            //bottom
            for (int j = endCol-1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }

            // left
            for (int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};
        printSpiral(matrix);
    }
}
