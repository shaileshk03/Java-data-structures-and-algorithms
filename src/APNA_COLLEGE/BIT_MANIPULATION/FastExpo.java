package APNA_COLLEGE.BIT_MANIPULATION;

/**
 * @author Shailesh
 */
public class FastExpo {

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){
            if( (n & 1) != 0){ // Check LSB
                // Multiple by power
                ans = ans * a;
            }
            // Squre
            a = a * a;
            // update n to shift one bit further.
            n = n >> 1;
        }
       return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3,5));
    }
}
