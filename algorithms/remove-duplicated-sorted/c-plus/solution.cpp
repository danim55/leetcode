class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        int k = 1;
        int counter = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            while (nums[i] == nums[k] && k < nums.size())
            {
                k++;
            }
            if (k < nums.size())
            {
                nums[i+1] = nums[k];
            }
            counter++;
        }
        return counter;
    }
};