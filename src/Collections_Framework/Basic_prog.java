package Collections_Framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shailesh
 */
public class Basic_prog {

   public static String findDuplicate(String str){
       Map<String, Integer> hmap= new HashMap<String, Integer>();
       String[] strArr = str.split("");
       for(String string: strArr){
        if(hmap.get(string) == null) {
            hmap.put(string, 1);
        } else {
            hmap.put(string, hmap.get(string) + 1);
        }
       }

       for(Map.Entry<String, Integer> entry: hmap.entrySet()){
        int getval = entry.getValue();
        if(getval > 1){
            System.out.println(entry.getKey());
        }
       }
       return str;
   }

    public static void main(String[] args) {
        findDuplicate("Hello");
    }
}

