package students.kristina_manevica.lesson_6.homework.level_4;

import java.util.Arrays;

public class ArrayUtil {

    public static int createArrayRandomLength() {
        int arrayLength = (int) (Math.random() * 10) + 1;
        return arrayLength;
    }

    public static int[][] createArray() {
        int[][] array = new int[createArrayRandomLength()][createArrayRandomLength()];
        return array;
    }

    public static void fillArrayRandomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static int sumArraysNumbers(int[][] array) {
        int sumArrayNumbers = 0;
        for (int[] rowArray : array) {
            for (int number : rowArray) {
                sumArrayNumbers += number;
            }
        }
        return sumArrayNumbers;
    }
}
