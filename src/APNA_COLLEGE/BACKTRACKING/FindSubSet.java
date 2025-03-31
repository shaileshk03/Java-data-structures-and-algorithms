package APNA_COLLEGE.BACKTRACKING;

/**
 * @author Shailesh
 */
public class FindSubSet {
   public static void findSubSets(String string,  String ans,  int i){
       // base case
       if(i == string.length()){
           if(ans.length() == 0){
               System.out.println("null");
           } else {
               System.out.println(ans) ;
           }
           return;
       }
       // recursion choices - either yes or no.
       // YES choice
       findSubSets(string, ans+string.charAt(i), i+1);

       // NO choice
       findSubSets(string, ans, i+1);
   }
    public static void main(String[] args) {
     String string = "abc";
        findSubSets(string, "", 0);
    }
}
