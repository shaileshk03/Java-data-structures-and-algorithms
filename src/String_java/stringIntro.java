 package String_java;

 import java.util.regex.Pattern;

 public class stringIntro {

     public static String reserveWordbyWord(String str) {
         Pattern pattern = Pattern.compile("\\s");
         String[] strArr = pattern.split(str);
         String result = "";

         for (int i = 0; i < strArr.length; i++) {
           if(i == strArr.length -1)
               result = strArr[i] + result;
           else
               result = " " + strArr[i] + result;
         }
         return result;
     }
    public static void main(String[] args) {
        //countEvenWords("This is a java language");
        String string = "This is a word reverse program";
        System.out.println(reserveWordbyWord(string));
        //System.out.println(revWord(string));
    }
}
