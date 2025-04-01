package Arrays;


/**
 * @author Shailesh
 */
public class Solution {

    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int diff = xor & -xor;
        int[] result = new int[2];
        for (int num : nums) {
            if ((num & diff) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }


    public static void main(String[] args){
        int[] arr = {1,2,1,3,2,5};
        Solution s = new Solution();
       System.out.println(s.singleNumber(arr));
        //System.out.println(s.singleNumber(arr));
    }
}
