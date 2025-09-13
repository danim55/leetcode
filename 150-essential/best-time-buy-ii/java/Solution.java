class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int share = prices[0];
        int difference;

        for (int i = 1; i < prices.length; i++) {
            difference = prices[i] - share;
            if (difference > 0) {
                profit += difference;
            }
            share = prices[i];
        }
        return profit;
    }
}