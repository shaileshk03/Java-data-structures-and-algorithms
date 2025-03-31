package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Program {

    // Word Count using hashmap
    public static void countWords(String str) {
        str = str.toLowerCase();
        str = str.replace(".", "");

        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] str_new = str.split("\\s+");

        for (String c : str_new) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 1) {
                System.out.println(entry.getKey() + " :" + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        countWords("java . . . java is text");
    }
}
