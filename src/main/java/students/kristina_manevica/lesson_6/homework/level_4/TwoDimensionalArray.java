package students.kristina_manevica.lesson_6.homework.level_4;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] array = ArrayUtil.createArray();

        ArrayUtil.fillArrayRandomNumbers(array);

        System.out.println("Array: " + Arrays.deepToString(array));

        int sum = ArrayUtil.sumArraysNumbers(array);

        System.out.println("Sum of all array elements: " + sum);
    }
}
