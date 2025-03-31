package APNA_COLLEGE.Recursion;

/**
 * @author Shailesh
 */
public class recursion2 {

   public static int tilingProblem(int n){
       // base case
       if (n == 0 || n ==1){
           return 1;
       }

//       int fnm1 = tilingProblem(n-1);
//       int fnm2 = tilingProblem(n-2);
//       int totways = fnm1 + fnm2;
//       return totways;

       return tilingProblem(n-1) + (n-1) * tilingProblem(n-2);
   }


   public static void removeDuplicates(String string,  int index, StringBuilder newStr, boolean [] map){
     // Base case
       if(index == string.length()){
           System.out.println(newStr);
           return;
       }

       char currChar = string.charAt(index);
       if (map[currChar-'a'] == true){
           // duplicate
           removeDuplicates(string, index+1, newStr, map);
       } else {
           map[currChar - 'a'] = true;
           removeDuplicates(string, index+1, newStr.append(currChar), map);
       }
   }


   // Friends pairing problem
    public static int friendsParing(int n){
         // Base case
        // If no of friends are 1 or 2 return n bc it will pair either 1 way or 2 ways
       if(n == 1 || n == 2){
           return n;
       }

       // Mutiple line solution
      /* int fnm1 = friendsParing(n -1);
       int fnm2 = friendsParing(n-2);
       int pairWays = (n-1) * fnm2;
       int totways = fnm1 + pairWays;
       return totways;*/

        // Single line solution
       return friendsParing(n-1) + (n-1) * friendsParing(n-2);
    }


    // Print binary
    public static void printBinString(int n, int lastPlace, String str){
       if(n == 0){
           System.out.println(str);
           return;
       }
       printBinString((n-1), 0, str+"0");
       if(lastPlace == 0){
           printBinString((n-1), 1, str+"1");
       }
    }

    public static void main(String[] args) {
      String string = "appnnacollege";
        removeDuplicates(string, 0, new StringBuilder(""), new boolean[26]);
        printBinString(3,0,"");
    }
}
