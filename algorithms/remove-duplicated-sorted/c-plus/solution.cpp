class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        int k = 0;
        for (int i = 0; i < nums.size() - 1; i++)
        {
            int counter = 0;
            int j = i + 1;
            while (nums[i] == nums[j])
            {
                j++;
                if (counter > 0)
                {
                    nums[i] = nums[j];
                    k++;
                }
                counter++;
            }
        }
        return k;
    }
};