import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int total = 0;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i > n; i++) {
            total += nums[i];
            count++;
            if (total >= n - 1)
                break;
        }
        return count;
    }
}