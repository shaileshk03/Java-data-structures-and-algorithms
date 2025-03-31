package APNA_COLLEGE;

/**
 * @author Shailesh
 */
public class day01 {

   // SUM of TWO NUMBERS
    public static int sumOfTwoNum(int a, int b){
        int sum = a + b;
        return sum;
    }

    // calculate simple interest
    public static float interestCal(float p, float r, float t){
        int i = 100;
        float simple_Interest  = (p * r * t) / i;
        return simple_Interest;
    }


   // Max of number three
    public void maxNumber(int x, int y, int z){
        if (x > y && x > z){
            System.out.println("X is max number : " + x);
        } else if (y > x && y > z) {
            System.out.println("Y is max number : " + y);
        } else{
            System.out.println("Z is max number : " + z);
        }

    }


    // Sum of natural number
    public static int sumOfNaturalNum(int n){
        int count = 0;
        for (int i = 0; i <=n; i++){
            count += i;
        }
       return count;
    }


    public static void main(String[] args) {
     int x = 10;
     int y = 20;
     int z = 15;

     day01 day01 = new day01();
     day01.maxNumber(x, y, z);
     System.out.println("Interest calculation " + interestCal(1000, 8, 2));
     System.out.println(sumOfTwoNum(x, y));
     System.out.println(sumOfNaturalNum(4));
    }
}
