class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int duplicatedIndex = 0;

        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[duplicatedIndex]) {
                duplicatedIndex++;
                nums[duplicatedIndex] = nums[i];
            }
        }
        return duplicatedIndex + 1;
    }
}