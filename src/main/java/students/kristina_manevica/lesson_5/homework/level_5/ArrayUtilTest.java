package students.kristina_manevica.lesson_5.homework.level_5;

import java.util.Arrays;

class ArrayUtilTest {

    private static int arrayLength = 5;

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
        int[] numbers = ArrayUtil.createArray(arrayLength);

        ArrayUtil.fillArrayWithRandomNumbers(numbers);
        System.out.println("Array elements for Max Number test: " + Arrays.toString(numbers));
        int maxNumber = ArrayUtil.findMaxNumber(numbers);
        System.out.println("Max number is: " + maxNumber);
    }

    public void shouldFindMinNumber() {
        // Напишите реализацию !!!
    }
}
