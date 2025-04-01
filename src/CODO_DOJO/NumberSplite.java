package CODO_DOJO;
import java.util.Scanner;
/**
 * @author Shailesh
 */
public class NumberSplite {
    private static boolean isValidSequence(String s, int len) {
        // Convert substring into a long data type
        // s.substring(0, length) - extract the position of s starting index 0 to the end.
        long firstNum = Long.parseLong(s.substring(0, len));
        // Created string builder object which is mutable
        StringBuilder expectedSequence = new StringBuilder();
        // assign new variable to the extracted substrings
        long currentNum = firstNum;
        // check the value and updated to the current number
        while (expectedSequence.length() < s.length()) {
            expectedSequence.append(currentNum++);
        }
        return expectedSequence.toString().equals(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // Iterate over all the less than or equals to half
        for (int len = 1; len <= str.length() / 2; len++) {
            if (isValidSequence(str, len)) {
                System.out.println("YES " + str.substring(0, len));
                return;
            }
        }
        System.out.println("NO");
        // close scanner object
        scanner.close();
    }
}


