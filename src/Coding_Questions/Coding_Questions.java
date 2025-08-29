package Coding_Questions;

import java.util.*;

/**
 * @author Shailesh
 */
public class Coding_Questions {

    // check palindrome
    // method will return true of false

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)) return false;
          left++;
          right--;
        }
     return true;
    }

    // Number

    // count each char in a string
    public static Map<Character, Integer> getCountWord(String str) {
        Map<Character, Integer> countword = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                countword.put(c, countword.getOrDefault(c, 0) + 1);
            }
        }
        return countword;
    }


    // ARRAY //

    // Find duplicates
    public static void findDuplicates(int[] arr){
        Set<Integer> seen = new HashSet<>();

        for(int num: arr){
            if(!seen.add(num)){
                System.out.println("Found duplicate ::: " + num);
            }
        }
    }

    // Remove Duplicates
    public static int removeDuplicates(int[] arr){
        // base case
        if(arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length-1; j++){
            if(arr[j] != arr[i] ){
               i++;
              arr[i] = arr[j];
            }
        }
     return i + 1;
    }

    public static void main(String[] args) {
      int[] arr = {23, 22, 43, 23, 94, 67, 67};
      String string = "level";

 //     boolean checkPlaindrome = isPalindrome(string);
 //      if(checkPlaindrome){
 //          System.out.println("String is a palindrome");
 //      } else{
 //          System.out.println("String is a palindrome");
 //      }

        // Find duplicates
        findDuplicates(arr);

       // count each character
        String input = "HELLO WORLD";
        Map<Character, Integer> count_string = getCountWord(input);

        for (Map.Entry<Character, Integer> entry : count_string.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " → Count: " + entry.getValue());
        }

        // Remove duplicates
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < newLength; i++){
            System.out.print(nums[i] );
        }

    }
}
