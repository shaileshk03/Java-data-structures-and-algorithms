package Java_Coding;

import java.util.LinkedList;
import java.util.Collections;
/**
 * @author Shailesh
 */
public class StringSort {
    public static String sortString(String S) {
        // Check if string is null or has any special character in
        if ((S == null) ? false : S.matches("[^A-Za-z0-9 ]")) {
            return "Invalid_Input";
        }

        // Create LinkedList for lowercase, uppercase, oddDigits, Evendigits
        LinkedList<Character> lowerCase = new LinkedList<>();
        LinkedList<Character> upperCase = new LinkedList<>();
        LinkedList<Character> oddDigits = new LinkedList<>();
        LinkedList<Character> evenDigits = new LinkedList<>();

        // for each loop to iterate through each character in the string.
        for (char c : S.toCharArray()) {
            // If Char is lower add them
            if (Character.isLowerCase(c)) {
                lowerCase.add(c);
                // Else if char is upper case add them after upper case
            } else if (Character.isUpperCase(c)) {
                upperCase.add(c);
                // Else if it is char is digit
            } else if (Character.isDigit(c)) {
                // Check even odd if remander is 0
                if ((c - '0') % 2 == 0) {
                    // Add them to the even digit
                    evenDigits.add(c);
                } else {
                    // add them to the odd digit
                    oddDigits.add(c);
                }
                // if it is not matching anything above return them as invalid input
            } else {
                return "Invalid_Input";
            }
        }

        // For sorting the string used collections.sort method : NOTE it's predefined method in collections
//        Collections.sort(lowerCase);
//        Collections.sort(upperCase);
//        Collections.sort(oddDigits);
//        Collections.sort(evenDigits);

        // Created a object of String builder class
        StringBuilder sortedString = new StringBuilder();
        // Sort the lower case string
        for (char c : lowerCase) {
            sortedString.append(c);
        }
        // sort the upper case string
        for (char c : upperCase) {
            sortedString.append(c);
        }
        //
        for (char c : oddDigits) {
            sortedString.append(c);
        }
        //
        for (char c : evenDigits) {
            sortedString.append(c);
        }
        // return the sorted string
        return sortedString.toString();
    }

    public static void main(String[] args) {
        String input = "***@ADV34";
        System.out.println(sortString(input));
    }

}
