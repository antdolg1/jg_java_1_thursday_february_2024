package students.nikola_korovacka.lesson_10.level1_task2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class ArrayUtilImpl implements ArrayUtil {

    @Override
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    @Override
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int count = 0; count < array.length; count++) {
            int rndValue = random.nextInt(11); // Генерирует случайное число от 0 до 10 включительно
            array[count] = rndValue;
        }
    }

    @Override
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if (max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    @Override
    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if (min.isPresent()) {
            minValue = min.getAsInt();
        }
        return minValue;
    }
}
