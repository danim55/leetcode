
public class Test {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int counter = 0;
        int changes = 0;

        for (int i = 1; i < length; i++) {
            counter++;
            if (nums[i] != nums[i - 1]) {
                if (counter > 1) {
                    nums[i - 1] = nums[i];
                    changes++;
                }
                counter = 0;
            }
        }
        return changes;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        removeDuplicates(nums);
    }

}
