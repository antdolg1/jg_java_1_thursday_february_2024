package students.ruslan_k.lesson_7.level_6;

public class IntArrayTransformTest {
    private final static int[] arrayForTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final static int[] expArrayTest1 = {2, 3, 4, 5, 6, 7, 8, 9};
    private final static int[] expArrayTest2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final static int[] expArrayTest3= {4};
    private final static int[] expArrayTest4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        boolean result;

        result = expectTest(expArrayTest1,2, 9);
        System.out.printf("Test 1 (lower limit > min element of array, upper limit < max element of array) is %s\n", result ? "Passed" : "Failed");
        result = expectTest(expArrayTest2,1, 10);
        System.out.printf("Test 2 (lower limit = min element of array, upper limit = max element of array) is %s\n", result ? "Passed" : "Failed");
        result = expectTest(expArrayTest3,4, 4);
        System.out.printf("Test 3 (lower limit = upper limit = one of element of array) is %s\n", result ? "Passed" : "Failed");
        result = expectTest(expArrayTest4,0, 11);
        System.out.printf("Test 4 (lower limit < min element of array, upper limit > max element of array) is %s\n", result ? "Passed" : "Failed");
    }

    static boolean expectTest(int[] in,int lowLimit, int upLimit) {
        int[] resultArray = IntArrayTransform.copyInRange(arrayForTest, lowLimit,upLimit);
        int expArrayLength = in.length;
        if (expArrayLength != resultArray.length) return false;

        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] != in[i]) return false;
        }
        return true;

    }
}
