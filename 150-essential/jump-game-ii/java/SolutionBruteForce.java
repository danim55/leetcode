class Solution {
    public int jump(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        int n = nums.length;
        // use array so it's mutable inside recursive calls
        int[] best = new int[]{Integer.MAX_VALUE};
        backtrack(nums, 0, 0, best, n);
        return best[0];
    }

    private void backtrack(int[] nums, int i, int jumps, int[] best, int n) {
        // pruning: if we've already found an equal or better solution, stop
        if (jumps >= best[0]) return;

        if (i == n - 1) {
            best[0] = Math.min(best[0], jumps);
            return;
        }

        int maxReach = Math.min(i + nums[i], n - 1);
        for (int next = maxReach; next > i; next--) {
            backtrack(nums, next, jumps + 1, best, n);
        }
    }
}
