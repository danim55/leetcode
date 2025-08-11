
import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] combined = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);
        for (int i = 1; i < combined.length; i++) {
            int element = combined[i];
            int previousElement = combined[i - 1];
            if (element < previousElement) {
                combined[i - 1] = element;
                combined[i] = previousElement;
            }
            System.out.println(combined.toString());
        }
    }
}