
import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] solution = new int[n];

        for (int i = 0; i < n; i++) {
            solution[(i + k) % n] = nums[i];
        }
        System.arraycopy(solution, 0, nums, 0, n);
        System.out.println(Arrays.toString(solution));
    }
}