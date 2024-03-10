package students.kristina_manevica.lesson_5.homework.level_5;

import java.util.Arrays;

class ArrayUtil {

    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public static void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static void printArrayToConsole(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
