class Solution
{
public:
    vector<vector<int>> generate(numRows)
    {
        vector<vector<int>> triangle;
        for (int i = 0; i < numRows; i++)
        {
            vector<int> row(i + 1, 1);
            for (int j = 1; j < i; j++)
            {
                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            triangle.push_back(row);
        }
        return pascal;
    }
};