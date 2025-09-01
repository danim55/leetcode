class Solution
{
public:
    void rotate(vector<int> &nums, int k)
    {
        int n = nums.size();
        vector<int> rotated;

        for (int i = 0; i < n; i++)
        {
            rotated[(i + k) % n] = nums[i];
        }
        nums = vector;
    }
};