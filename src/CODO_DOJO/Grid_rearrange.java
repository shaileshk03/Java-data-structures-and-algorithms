package CODO_DOJO;
import java.util.Arrays;

/**
 * @author Shailesh
 */
public class Grid_rearrange {
    public static String isGridRearrangeable(String[] grid) {
        // base case
        if(grid.length < 1){
           return "Invalidate String";
        }

        // Get the length of rows and columns
        int rows = grid.length;
        int cols = grid[0].length();

        // Sort each row Iterate over all the elements
        for (int i = 0; i < rows; i++) {
            // Create and char Array put all char to char Array
            char[] rowChars = grid[i].toCharArray();
            // Sort them using sort array method
            Arrays.sort(rowChars);
            // assign each char to new row chars
            grid[i] = new String(rowChars);
        }

        // Check columns Iterate over all the columns
        for (int i = 0; i < cols * (rows - 1); i++) {
            int col = i % cols;
            int row = i / cols + 1;
            if (grid[row].charAt(col) < grid[row - 1].charAt(col)) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        String[][] testCases = {
                {"abc", "ade", "efg"},
                {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"},
                {"abc","lmp","qrt"},
                {"mpxz","abcd","wlmf"},
                {"abc","hjk","mpq","rtv"},
                {"p"},
                {"vbznfwg","eacklwk","bmarzvp","rwgnjqd","xqddtln","wuxtduk","rzmfcik"},
                {"tjxxx","xtxxj","rzzzz","zzrzz","rzzzz"},
                {"zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz","zzzzzzzzzz"},
                {"umcuoqaj","bbjgbhcr","lpomaerv","tknrndsj","qxyxbtna","wktoedyl","kpfyjlpm","geixiery"},
                {"eb@cd", "fghij", "o1mkn", "trpqs", "xywu8"}
        };

        for (String[] testCase : testCases) {
            System.out.println(isGridRearrangeable(testCase));
        }
    }
}
