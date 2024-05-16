package teacher.lesson_10.lessoncode.array_problem;

import java.util.Arrays;

public class SortSelect {

    public int[] maxProductPair(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;

        if (nums[0] * nums[1] > nums[length - 1] * nums[length - 2]) {
            return new int[]{nums[0], nums[1]};
        } else {
            return new int[]{nums[length -1], nums[length - 2]};
        }
    }
}
