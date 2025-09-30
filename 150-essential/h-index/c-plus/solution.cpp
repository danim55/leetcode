class Solution
{
public:
    int hIndex(vector<int> &citations)
    {
        int hIndex = 0;
        int numberPapers = 0;

        for (int i = 1; i <= citations.size() + 1; i++)
        {
            for (int j = 0; j < citations.size() - 1; j++)
            {
                if (citations[j] >= j)
                {
                    numberPapers++;
                }
                if (numberPapers >= j)
                {
                    hIndex = j;
                    break;
                }
            }
            numberPapers = 0;
        }
    }
};