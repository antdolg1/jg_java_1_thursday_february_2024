package teacher.lesson_10.lessoncode.array_problem;

public class LinearTraversal {
    public int[] maxProductPair(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        int min1 = 0;
        int min2 = 0;

        for(int num : nums){
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        if (min1 * min2 > max1 * max2) {
            return new int[]{min1, min2};
        } else {
            return new int[]{max1, max2};
        }

    }
}
