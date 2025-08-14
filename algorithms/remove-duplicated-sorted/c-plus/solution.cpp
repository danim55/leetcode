class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        int k = 0;
        int counter = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] == nums[i + 1])
            {
                k++;
            }
            nums[i] = nums[k];
            counter++;
        }
        return counter;
    }
};