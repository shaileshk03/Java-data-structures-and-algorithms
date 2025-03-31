package String_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Companies_CodingQS {

    public static String onlySpecialCharacters(String str, String st1) {
        // Regex to check if a string contain only special characters
        String regex = "[^a-zA-Z0-9]+";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty then print No
        if (str == null && st1 == null) {
            System.out.println("Empty String");
        }

        // Find match between given string
        // & regular expression
        Matcher m = p.matcher(str);
        Matcher m1 = p.matcher(st1);

        // Print Yes If the string matches
        // with the Regex
        if (m.matches())
            System.out.println("True");
        else
            System.out.println("False");

        if(m1.matches())
            System.out.println("True");
        else
            System.out.println("False");

        String string = new String(str);
        String string1 = new String(st1);
        return string + " " + string1;
    }

    // IBM Interview Questions
  /*  public static String comparespecialString(String strwithChar, String strwithoutChar) {
       return comparespecialString(strwithChar, strwithoutChar);
    }*/

    public static String comparespecialString(String strwithChar, String strwithoutChar) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : strwithoutChar.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : strwithChar.toCharArray()) {
            if (!charSet.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }


    // Find factorial


    // Rotate elements in array using List<Integer>
    public static List<Integer> RotateArray(List<Integer> intArray){
        if(intArray == null || intArray.isEmpty()){
            return intArray;
        }
        int lastElement = intArray.remove(intArray.size() -1);
        intArray.add(0, lastElement);
     return intArray;
    }


    public static void main(String[] args) {
        // Given string str
        String str = "@#$&%!~";
        String str1 = "FALSE";
        // Function Call
        //onlySpecialCharacters(str, str1);
        //comparespecialString(str, str1);

        List<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        RotateArray(intArray);
        System.out.println(intArray);
    }
}
