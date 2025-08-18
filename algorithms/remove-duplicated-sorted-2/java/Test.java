
public class Test {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int j = 1;
        int counter = 1;

        for (int i = 0; i < length; i++) {
            if (nums[i - 1] == nums[i]) {
                counter++;
            }
            if (counter <= 2) {

            }
        }

        return counter;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        removeDuplicates(nums);
    }

}
