
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        for (int i = 0; i < n; i++) {
            if (nums[i] > n - 1 || nums[i] > n - i - 1) {
                return true;
            } else if (nums[i] == 0){
                break;
            }
        }
        return false;
    }
}