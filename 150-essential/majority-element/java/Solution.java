class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0;
        int number = nums[0];
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < length; i++) {
            if(nums[i]==nums[i-1]){
                counter++;
            }
            if(counter >= length/2){
                number = nums[i];
                break;
            }
        }
        return number;
    }
}