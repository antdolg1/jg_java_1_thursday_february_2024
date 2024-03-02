package students.ruslan_k.lesson_5.level_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        int[] array;
        ArrayUtil arrayUtil = new ArrayUtil();
        ArrayUtilTest test = new ArrayUtilTest();
        array = test.shouldCreateArray(10);

        test.shouldFindMaxNumber(arrayUtil, array);
        test.shouldFindMinNumber(arrayUtil, array);


    }

    public int[] shouldCreateArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void shouldFindMaxNumber(ArrayUtil arrayUtil, int[] array) {
        //ArrayUtil arrayUtil=new ArrayUtil();
        int testMaxValue = 5000;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 500);
        }
        array[array.length / 2] = testMaxValue;
        if (testMaxValue == arrayUtil.findMaxNumber(array)) {
            System.out.println("MAX Test Passed");
        } else {
            System.out.println("MIN Test Failed");
        }
    }

    public void shouldFindMinNumber(ArrayUtil arrayUtil, int[] array) {
        //ArrayUtil arrayUtil=new ArrayUtil();
        int testMinValue = -100;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 500);
        }
        array[array.length / 2] = testMinValue;
        if (testMinValue == arrayUtil.findMinNumber(array)) {
            System.out.println("MIN Test Passed");
        } else {
            System.out.println("MIN Test Failed");
        }
    }
}
