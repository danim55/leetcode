import java.util.Arrays;

public class Test {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int j = 0;
        int counter = 0;

        if (length == 0)
            return 0;

        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[j]) {
                if(j > 0 && nums[j-1] == nums[j]) {
                    nums[j] = nums[i];
                    counter++;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(counter);
        return counter;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        removeDuplicates(nums);
    }

}
