class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int share = prices[0];
        int difference;

        for (int i = 1; i < prices.length; i++) {
            System.out.println(profit);
            System.out.println(share);
            difference = prices[i] - share;
            if (difference > 0) {
                profit += difference;
                i++;
            }
            if (prices[i] < share) {
                share = prices[i];
            }
            System.out.println(difference);
            System.out.println(profit);
            System.out.println(share);
        }
        return profit;
    }
}