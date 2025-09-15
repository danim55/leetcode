
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;
        int maxJump = 0;
        for (int i = 0; i < n; i++) {
            if (maxJump < nums[i] + i)
                maxJump = nums[i] + i;

            if (maxJump <= i) {
                return false;
            }

            if (maxJump >= n - 1) {
                return true;
            }
        }
        return maxJump >= n - 1;
    }
}