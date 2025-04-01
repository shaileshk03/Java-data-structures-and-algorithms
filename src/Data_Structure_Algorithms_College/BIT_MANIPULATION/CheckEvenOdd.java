package Data_Structure_Algorithms_College.BIT_MANIPULATION;

/**
 * @author Shailesh
 */
public class CheckEvenOdd {

    public static void checkOddOrEven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0){
            System.out.println(n + " :is a Even Number");
        } else {
            System.out.println(n + " :is a Odd Number");
        }
    }


    // Get Ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if ((n & bitMask) == 0){
            return 0;
        } else {
            return -1;
        }
    }


    // Set Ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return 0 | bitMask;
    }

    public static void main(String[] args) {
        checkOddOrEven(3);
        checkOddOrEven(6);

        getIthBit(10, 3);
        setIthBit(10, 3);

    }
}
