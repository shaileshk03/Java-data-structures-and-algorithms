package APNA_COLLEGE.BACKTRACKING;

/**
 * @author Shailesh
 */
public class FindPermutations {

    public static void findPermutations(String string, String ans){
        // base case
       if(string.length() == 0){
           System.out.println(ans);
           return;
       }
        // recursion
       // Iterate over all sub string
       for (int i = 0; i < string.length(); i++){
           // Get sub string as character
          char current = string.charAt(i);
          // "abcde" = "ab" + "de" = "abde"
          String newStr = string.substring(0, i) + string.substring(i+1);
          findPermutations(string, ans);
       }
    }
    public static void main(String[] args) {

    }
}
