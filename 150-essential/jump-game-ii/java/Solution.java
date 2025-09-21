
import static java.lang.Integer.max;

class Solution {
    public int jump(int[] nums) {
        int smallest = 0;
        int n = nums.length;
        int end = 0;
        int far = 0;

        for (int i = 0; i < n - 1; i++) {
            far = max(far, i + nums[i]);

            if (i == end) {
                smallest += 1;

            }
        }

        return 0;
    }
}