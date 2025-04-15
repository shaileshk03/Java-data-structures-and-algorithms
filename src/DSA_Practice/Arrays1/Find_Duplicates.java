package DSA_Practice.Arrays1;

import java.util.HashSet;

/**
 * @author Shailesh
 */
public class Find_Duplicates {

    public static int[] getDuplicates(int[] numbers) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        int[] result = new int[duplicates.size()];
        int index = 0;
        for (int duplicate : duplicates) {
            result[index++] = duplicate;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3};
        System.out.println(getDuplicates(arr));
    }
}
