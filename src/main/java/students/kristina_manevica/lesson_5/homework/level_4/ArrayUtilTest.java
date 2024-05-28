package students.kristina_manevica.lesson_5.homework.level_4;

import java.util.Arrays;

class ArrayUtilTest {

    private static int arrayLength = 5;
    private static int[] testArray = {3, 5, 7, 9, 0};

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        int[] numbers = ArrayUtil.createArray(arrayLength);

        System.out.println(numbers.length == arrayLength ? "Create Array Test passed" : "Error!");
    }

    public void shouldFillArray() {

        int[] numbers = ArrayUtil.createArray(arrayLength);

        ArrayUtil.fillArrayWithRandomNumbers(numbers);
        System.out.println("Array elements for Fill Array Test: " + Arrays.toString(numbers));
    }

    public void shouldFindMaxNumber() {

        int expectedResult = 9;
        int actualResult = ArrayUtil.findMaxNumber(testArray);
        System.out.println((expectedResult == actualResult) ? "Test passed, max number is: " + actualResult :
                "Error in max test!");
    }

    public void shouldFindMinNumber() {

        int expectedResult = 0;
        int actualResult = ArrayUtil.findMinNumber(testArray);
        System.out.println((expectedResult == actualResult) ? "Test passed, min number is " + actualResult :
                "Error in min test!");
    }
}
