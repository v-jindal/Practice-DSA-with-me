public class Leetcode121 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for( int i = 1; i < prices.length ; i++ ){
            if(prices[i] > buy){
                profit = Math.max(profit, prices[i] - buy);
            }
            buy = Math.min(buy, prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        
    }
}
