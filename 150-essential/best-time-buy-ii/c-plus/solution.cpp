class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        int profit = 0;
        int share = prices[0];
        int difference;

        for (int i = 0; i < prices.size(); i++)
        {
            difference = prices[i] - share;
            if (difference > 0)
            {
                profit += difference;
            }
            share = prices[i];
        }
        return profit;
    }
};