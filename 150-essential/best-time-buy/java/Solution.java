class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int profit = 0;
        int difference;
        for (int i = 1; i < n; i++) {
            difference = prices[i] - min;
            if (prices[i] < min) {
                min = prices[i];
            }
            if (difference > profit) {
                profit = difference;
            }
        }
        return profit;
    }
}