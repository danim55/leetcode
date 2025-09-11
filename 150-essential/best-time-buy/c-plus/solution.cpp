class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        int n = prices.size();
        int min = prices[0];
        int profit = 0;
        int difference;
        for (int i = 1; i < n; i++)
        {
            difference = prices[i] - min;
            if (prices[i] < min)
            {
                min = prices[i];
            }
            if (difference > profit)
            {
                profit = difference;
            }
        }
        return profit;
    }
};