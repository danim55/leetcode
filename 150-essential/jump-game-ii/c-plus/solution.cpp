class Solution
{
public:
    int jump(vector<int> &nums)
    {
        int n = nums.size();
        int far = 0;
        int end = 0;
        int smallest = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (i == end)
            {
                smallest += 1;
                end = far;
            }
        }

        return smallest;
    }
}