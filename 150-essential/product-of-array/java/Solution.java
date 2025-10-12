class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = 1;
            answer[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                answer[i] *= nums[j];
            }
            nums[i] = temp;
        }

        return answer;
    }
}