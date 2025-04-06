package Data_Structure_Algorithms_College.ArrayLists;

import java.util.ArrayList;

/**
 * @author Shailesh
 */
public class MostWater {

    public static int storeWater(ArrayList<Integer>height){
      int maxWater = 0;

      for (int i=0; i<height.size(); i++){
          for (int j= i+1; j<height.size(); j++) {
             int ht = Math.min(height.get(i), height.get(j));
             int width = j-i;
             int currWater = ht * width;
             maxWater = Math.max(maxWater, currWater);
          }
      }
     return maxWater;
    }

    // TWO POINTER APPROACH
    public static int storeWaterTwoPointer(ArrayList<Integer>height){
        int maxWater = 0;
        int left = 0 ;
        int right = height.size()-1;

        while (left < right){
             // calculate water area
             int ht = Math.min(height.get(left), height.get(right));
             int width = left-right;
             int currWater = ht * width;
             maxWater = Math.max(maxWater, currWater);

             // update pointer
            if(height.get(left) < height.get(right)){
              left++;
            } else {
              right--;
            }
        }
     return maxWater;
    }


    public static void main(String[] args) {
     ArrayList<Integer> height = new ArrayList<>();
      height.add(1);
      height.add(8);
      height.add(6);
      height.add(2);
      height.add(5);
      height.add(4);
      height.add(8);
      height.add(3);
      height.add(7);
      System.out.println(storeWater(height));
    }
}
