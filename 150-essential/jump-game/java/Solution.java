
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;
        if (nums[0] == 0)
            return false;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= n - 1 || nums[i] >= n - i - 1) {
                return true;
            }
        }
        if (nums[n - 2] == 0)
            return false;
        return false;
    }
}