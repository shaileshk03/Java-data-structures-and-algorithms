package String_java;

import java.util.HashMap;
import java.util.SortedMap;

public class String_reverse {

    // 1st way to reverse string.
    public static String StringMyReverse(String str){
        // Create a String variable with no value
        String reversedStr = "";
        // i = str.length - 1,
        // i >= 0
        // i --
        for(int i = str.length() -1; i >= 0; i--){
            // call the string variable += string char at i value
            reversedStr += str.charAt(i);
        }
        // return string
        return reversedStr;
    }


    // 2nd way to reverse string using swipe method.
    public static String reverseString(String str) {
        // create a char array assign str.toCharArray method to convert to char array
        char[] chars = str.toCharArray();
        // Create two int one to take starting point of length 0, and another end of the int value.
        // Loop starts from 0 not from one so we need to adjust the length value using length -1
        int left = 0;
        int right = chars.length - 1;

        //While 0 less than the last value of the string
        while (left < right) {
            // Swap characters at left and right indices
            // create chars variable assign chars[left]
            // assign chars left to right;
            // and chars right to temp you have swiped all the values
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            // Move pointers towards the center
            left++;
            right--;
        }
        // Convert char array back to string
        return new String(chars);
    }

    // Word reverse using hashmap

    public static String revWordsWithHashMap(String str){
       String[] words = str.split(" ");
        HashMap<Integer, String> wordMap =  new HashMap<>();
         for(int i = 0; i < words.length; i++){
             wordMap.put(i, words[i]);
         }

       StringBuilder revStr = new StringBuilder();
         for(int i = words.length -1; i >= 0; i--){
             revStr.append(wordMap.get(i));
             if(i != 0){
                 revStr.append(" ");
             }
         }
     return revStr.toString();
    }


    public static String reverseStr(String str){
        // Create a char array and init string to char array
        char[] chars = str.toCharArray();
        // left and right
        int left = 0;
        int right = str.length()-1;

        while (left < right){
            //Swap character left to right
         char temp = chars[left];
         chars[left] = chars[right];
         chars[right] = temp;
         // move pointer to the centre
         left++;
         right--;
        }
     return new String(chars);
    }
    public static void main(String[] args) {
        String word = "This is a string";
        //System.out.println(reverseString(word));
        //System.out.println(StringMyReverse(word));

        String reversed = revWordsWithHashMap(word);
        System.out.println("Reversed Sentence : " + reversed);
    }

}
