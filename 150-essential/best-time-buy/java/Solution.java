class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int difference;
        for (int i = 0; i < n; i++) {
            difference = prices[i + 1] - prices[i];
            if (profit < difference) {
                profit = difference;
            }
        }
        return profit;
    }
}