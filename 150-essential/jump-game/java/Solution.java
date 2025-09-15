
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        int maxPosition = 0;
        int currentMaxPosition = 0;
        int difference;
        for (int i = 0; i < n; i++) {
            System.out.println("Num value: " + nums[i]);
            currentMaxPosition = nums[i] + i;
            difference = currentMaxPosition - maxPosition;
            System.out.println("Current max position: " + currentMaxPosition);
            if (difference > 0) {
                maxPosition = currentMaxPosition;
            }
            if (maxPosition <= i) {
                return false;
            }
            System.out.println("Max position: " + maxPosition);
        }
        return maxPosition >= n;
    }
}