class Solution
{
public:
    int hIndex(vector<int> &citations)
    {
        int hIndex = 0;
        int numberPapers = 0;

        for (int i = 1; i <= citations.size() + 1; i++)
        {
            for (int j = 0; j < citations.size(); j++)
            {
                if (citations[j] >= i)
                {
                    numberPapers++;
                }
                if (numberPapers >= i)
                {
                    hIndex = i;
                    break;
                }
            }
            numberPapers = 0;
        }
        return hIndex;
    }
};