
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        int maxPosition = 0;
        int currentMaxPosition;
        int difference;
        for (int i = 0; i < n; i++) {
            currentMaxPosition = nums[i] + i;
            difference = currentMaxPosition - maxPosition;
            if (difference > 0) {
                maxPosition = currentMaxPosition;
            }
            if (maxPosition >= n-1) {
                return true;
            }
            if (maxPosition <= i) {
                return false;
            }
        }
        return maxPosition >= n-1;
    }
}