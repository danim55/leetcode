import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int jump(int[] nums) {
        List<Integer> maxLeap = new ArrayList<>();
        maxLeap.add(0);
        maxLeap.add(0);

        for (int i = 0; i < nums.length; i++) {
            int min = Collections.min(maxLeap);
            if (nums[i] > min) {
                maxLeap.remove(maxLeap.indexOf(min));
                maxLeap.add(nums[i]);
            }
        }
        return 0;
    }
}