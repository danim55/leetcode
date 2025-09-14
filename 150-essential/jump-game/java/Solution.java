
import java.util.stream.IntStream;

class Solution {
    public boolean canJump(int[] nums) {
        int sum = IntStream.of(nums).sum();
        return sum > nums.length * 2;
    }
}