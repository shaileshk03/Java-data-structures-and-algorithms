package Data_Structure_Algorithms_College.Arrays;

/**
 * @author Shailesh
 */
public class BuysellStocks {
    public static int buyAndSellStocks(int[] prices){
       int buyPrice = Integer.MAX_VALUE;
       int minPrice = Integer.MIN_VALUE;
       int maxProfit = 0;

       for (int i = 0; i < prices.length; i++){
          if(minPrice <= prices[i]){
              minPrice = prices[i];
             int price = prices[i] - buyPrice;
          }
       }
     return maxProfit;
    }

    // Buy sell stocks Leetcode III solution.
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[][] dp = new int[n][3];

        for (int k = 1; k <= 2; k++) {
            int maxDiff = -prices[0];
            for (int i = 1; i < n; i++) {
                dp[i][k] = Math.max(dp[i - 1][k], prices[i] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i][k - 1] - prices[i]);
            }
        }
        return dp[n - 1][2];
    }

    public static void main(String[] args) {
    //int[] prices= {3,3,5,0,0,3,1,4};
    //int[] prices= {7,1,5,3,6,4};
    int[] prices= {1,2,3,4,5};
    System.out.println(maxProfit(prices));
    }

}
