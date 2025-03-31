package Leetcode.ArraysQS;

/**
 * @author Shailesh
 */
public class BuySellStocks {

    public static int buySellStocksI(int[] prices){
        // Let's assume your buy stock price is Max value.
        int buyStockPrice = Integer.MAX_VALUE;
        // Let's assume your profit at start it is zero.
        int maxProfit = 0;

        // Run a loop through all days stock prices
        for (int i = 0; i< prices.length; i++){
            // check if buy price of stock is less than the current day stock price.
            if(buyStockPrice < prices[i]){ // profit
                int profit = prices[i] - buyStockPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStockPrice = prices[i];
            }
        }
       return maxProfit;
    }

    public static int buySellStocks_totalProfit(int[] prices){
        // Let's assume total profit is least integer value
        int totalProfit = Integer.MIN_VALUE;
        // Lets' assume Minimum profit would be equals to value of price
        int minProfit = prices[0];

        // Iterate through all the prices
        for(int price: prices){
            // Calculate the total profit.
            totalProfit = Math.max(totalProfit, price - minProfit);
            // Calculate the minimum profit.
            minProfit = Math.min(minProfit, price - totalProfit);
        }
     return totalProfit;
    }

    public static void main(String[] args) {
        //int[] prices= {7,1,5,3,6,4};
        //int[] prices= {7,1,5,3,6,4};
        int[] prices= {1,2,3,4,5};
        System.out.println(buySellStocks_totalProfit(prices));
    }


}
