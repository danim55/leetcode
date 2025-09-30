class Solution
{
public:
    int hIndex(vector<int> &citations)
    {
        int hIndex = 0;
        int numberOfPapers[citations.size() + 1];
        int counterOfPapers = 0;

        for (int i = 0; i < citations.size())
        {
            if (citations[i] >= citations.size())
            {
                numberOfPapers[citations.size()] = citations[i];
            }
            else
            {
                numberOfPapers[citations[i]] = citations[i];
            }
        }

        for (int j = numberOfPapers.size() - 1; j > 0; j--)
        {
            counterOfPapers += numberOfPapers[j];
            if (counterOfPapers >= j)
            {
                hIndex = j;
                break;
            }
        }
    }
    return hIndex;
};