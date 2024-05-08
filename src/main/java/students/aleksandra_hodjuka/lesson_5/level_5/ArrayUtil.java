package students.aleksandra_hodjuka.lesson_5.level_5;

import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength]; // Создание массива заданной длины
        return array;

    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0]; // Предполагаем, что первый элемент массива - максимальный

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        return maxNumber;
    }
    public int findMinNumber(int[] array) {
        int minNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }

        return minNumber;
    }
}