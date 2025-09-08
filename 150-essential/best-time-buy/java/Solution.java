class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int difference;
        for (int i = 0; i < n - 1; i++) {
            difference = prices[i + 1] - prices[i];
            if (profit < difference) {
                profit = difference;
            }
            System.out.println(profit);
            System.out.println(difference);
        }
        return profit;
    }
}