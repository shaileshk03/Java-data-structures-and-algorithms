package Leetcode_Solved.ArraysQS.Medium;

/**
 * @author Shailesh
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        // let's assume most water is min value
        int most_water = Integer.MIN_VALUE;

        while(left < right){
            // calculate water
            int water = (right-left)* Math.min(height[left], height[right]);
            // Get the most water whoever is max
            most_water = Math.max(water, most_water);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return most_water;
    }
    public static void main(String[]args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater sol = new ContainerWithMostWater();
        System.out.print(sol.maxArea(height));
    }
}
