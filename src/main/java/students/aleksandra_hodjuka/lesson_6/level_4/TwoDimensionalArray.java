package students.aleksandra_hodjuka.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Размеры двумерного массива
        int rows = 3;
        int cols = 3;

        // Создаем двумерный массив
        int[][] array = new int[rows][cols];

        // Заполняем двумерный массив случайными числами
        fillArray(array);

        // Выводим двумерный массив
        System.out.println("Двумерный массив:");
        printArray(array);

        // Вычисляем сумму всех чисел в двумерном массиве
        int sum = calculateSum(array);
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }

    // Метод для заполнения двумерного массива случайными числами
    public static void fillArray(int[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(10); // случайное число от 0 до 9
            }
        }
    }

    // Метод для вывода двумерного массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для вычисления суммы всех чисел в двумерном массиве
    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
