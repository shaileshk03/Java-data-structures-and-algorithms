package APNA_COLLEGE.ArraysQs;

/**
 * @author Shailesh
 */
public class TrappedRainWatter {


     public static int trappedRainWater(int[] height){

     // calculate left max boundary - array
       int[] leftMax = new int[height.length];
       // calculate left max so my left max
       leftMax[0] = height[0];
       // Loop will start from 1 because we have already calculated for Zero above leftmax[0]
       // remember this it's important in most of the cases
       for (int i = 1; i < height.length; i++){
           leftMax[i] = Math.max(height[i], leftMax[i -1]);
       }


     // calculate right max boundary - array
      int[] rightMax = new int[height.length];
         rightMax[height.length-1] = height[height.length-1];

         for (int i = height.length-2; i>=0; i--){
          rightMax[i] = Math.max(height[i], rightMax[i+1]);
         }
     //loop
         int trappedwater = 0;
       for (int i =0; i < height.length; i++){
           int waterLevel = Math.max(leftMax[i], rightMax[i]);
           // add
           trappedwater += waterLevel - height[i];
       }
     //water level min(left max boundary - right max boundary)
     //trapped water = waterLevel - height[i]
      return trappedwater;
     }


    //Time Complexity: O(N) because we are using 2 pointer approach.
    //Space Complexity: O(1) because we are not using anything extra.
     public static int trappedWater(int[] height){
         int n = height.length;
        // Left start from 0
        int left = 0;
        // So right length -1
        int right = n -1;
        int result = 0;
        int maxLeft = 0;
        int maxRight = 0;

        while(left <= right){
        if(height[left] <= height[right]){

            if(height[left] >= maxLeft){
                maxLeft = height[left];
            } else {
                result += maxLeft - height[left];
            }
            left++;
        } else {
             if(height[right] >= maxLeft){
                maxRight = height[right];
             } else {
                 result += maxRight - height[right];
             }
           right --;
        }
        }
      return result;
     }

    public static void main(String[] args) {
     int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainWater(height));
    }
}
