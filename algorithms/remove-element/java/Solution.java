class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int index = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                System.out.println(nums[i]);
                counter++;
                while (true) {
                    if (nums[index] != val) {
                        nums[i] = nums[index];
                        break;
                    }
                    index--;
                }
            }
        }
        return counter;
    }
}