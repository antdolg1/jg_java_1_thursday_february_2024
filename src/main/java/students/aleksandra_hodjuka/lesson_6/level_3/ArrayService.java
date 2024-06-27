package students.aleksandra_hodjuka.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {


    public static boolean contains(int[] array, int numberToSearch) {
        for (int number : array) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrences(int[] array, int numberToSearch) {
        int count = 0;

        for (int number : array) {
            if (number == numberToSearch) {
                count++;
            }
        }
        return count;

    }

    public static void replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break; // Останавливаемся после замены первого числа.
            }
        }
    }

    public static void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Меняем местами элементы в начале и в конце массива
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Перемещаемся к центру массива
            start++;
            end--;
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 5};
        int number = 1;
        int numberToReplace = 3;
        int newNumber = 7;
        boolean result = contains(array, number);
        int occurrences = countOccurrences(array, number);
        System.out.println("Количество повторений числа " + number + ": " + occurrences + "раза!");
        if (contains(array, number)) {
            System.out.println("Массив содержит число " + number);
        } else {
            System.out.println("Массив не содержит число " + number);
        }
        replaceFirst(array, numberToReplace, newNumber);
        System.out.println("Массив после замены: " + Arrays.toString(array));
        int[] array2 = {2, 4, 3, 6, 5};
        replaceAll(array2, numberToReplace, newNumber);
        System.out.println("Массив после замены всех вхождений: " + Arrays.toString(array2));
        System.out.println("Массив до переворота: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Массив после переворота: " + Arrays.toString(array));
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        sort(array);
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}
