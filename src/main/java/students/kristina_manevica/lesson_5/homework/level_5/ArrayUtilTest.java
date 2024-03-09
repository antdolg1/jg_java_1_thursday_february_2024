package students.kristina_manevica.lesson_5.homework.level_5;

import java.util.Arrays;

class ArrayUtilTest {

    private static int arrayLength = 5;

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArray();
    }

    public static void shouldCreateArray() {

        int[] numbers = ArrayUtil.createArray(arrayLength);

        System.out.println(numbers.length == arrayLength ? "Test passed" : "Error!");
    }

    public static void shouldFillArray() {

        int[] numbers = ArrayUtil.createArray(arrayLength);

        ArrayUtil.fillArrayWithRandomNumbers(numbers);
        System.out.println("Array: " + Arrays.toString(numbers));
    }
}
