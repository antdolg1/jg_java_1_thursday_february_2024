package teacher.lesson_10.lessoncode.array_problem;

public class BruteForce {
    public int[] maxProductPair(int[] nums) {
        int[] result = new int[2];
        long maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long product = (long) nums[i] * nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }

//    private boolean willMultiplyOverflow(int x, int y) {
//        if (x > 0 && y > 0) {
//            return x > Integer.MAX_VALUE / y;
//        }
//
//        if (x > 0 && y < 0) {
//            return y < Integer.MIN_VALUE / x;
//        }
//
//        //...
//    }

}
