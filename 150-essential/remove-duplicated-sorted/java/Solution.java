class Solution {
    public int removeDuplicates(int[] nums) {
        int arrayLength = nums.length;
        int j = 0;

        for (int i = 1; i < arrayLength; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}