package students.aleksandra_hodjuka.lesson_5.level_4;

import java.util.Random;

public class Task_28 {
    public static void main(String[] args) {
        // Создание массива произвольной длины
        int length = 3;
        int[] array = new int[length];

        // Заполнение массива случайными числами
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000);
        }

        // Вывод всех элементов массива на консоль
        System.out.println("Элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }

        // Поиск наименьшего числа в массиве
        int minNumber = array[0]; // Предполагаем, что первый элемент массива - наименьший
        for (int i = 1; i < length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }

        // Вывод наименьшего числа на консоль
        System.out.println("Наименьшее число в массиве: " + minNumber);
    }

}
