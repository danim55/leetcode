class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int j = 1;
        int counter = 1;

        for (int i = 1; i < length; i++) {
            if (nums[i - 1] == nums[i]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}