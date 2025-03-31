package APNA_COLLEGE.BACKTRACKING;

/**
 * @author Shailesh
 */
public class NQueen {
    public static void nQueen(char board[][], int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++){
          if(isSafe(board, row, j)){
              // Queen seating up here
              board[row][j] = 'Q';
              //call for next row
              nQueen(board, row+1); // function call
              // moved queen from here
              board[row][j] = '.'; // backtracking step
          }
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
      // vertical up
        for (int i = row-1; i >=0; i--){
          if(board[i][col] == 'Q'){
             return false;
          }
        }

    return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------chees board-------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int n = 2;
      char [][] board = new char[n][n];
      for (int i = 0; i < n; i ++){
          for (int j = 0; j < n; j++){
            board[i][j] = 'x';
          }
       }
       nQueen(board, 0);
    }
}
