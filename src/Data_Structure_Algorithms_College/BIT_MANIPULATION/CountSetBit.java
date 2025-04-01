package Data_Structure_Algorithms_College.BIT_MANIPULATION;

/**
 * @author Shailesh
 */
public class CountSetBit {

    // Count set bit in a number question asked in Amazon and Google.
    public static int setBitCount(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) != 0) { // check our LSB
                count++;
            }

            n = n >> 1;
        }
     return count;
    }

    public static void main(String[] args) {
        System.out.println(setBitCount(15));
    }
}
