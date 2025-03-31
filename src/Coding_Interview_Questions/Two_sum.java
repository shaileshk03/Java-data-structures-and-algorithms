package Coding_Interview_Questions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Shailesh
 */
public class Two_sum {
        public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
            ArrayList<Pair<Integer, Integer>> result = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int complement = target - arr.get(i);
                if (map.containsKey(complement)) {
                    result.add(new Pair<>(complement, arr.get(i)));
                }
                map.put(arr.get(i), i);
            }
            return result;
        }

        public static class Pair<K, V> {
            public K key;
            public V value;

            public Pair(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
}

