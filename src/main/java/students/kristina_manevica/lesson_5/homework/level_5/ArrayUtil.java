package students.kristina_manevica.lesson_5.homework.level_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {

    public static int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        return scanner.nextInt();
    }

    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public static void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static void fillArrayFromUser(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please input element Nr." + (i + 1));
            array[i] = scanner.nextInt();
        }
    }

    public static void printArrayToConsole(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static void printArrayElements(int[] array) {
        System.out.print("Array: [ ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("]" + "\n");
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

    public static void printEvenNumbersOfArray(int[] array) {
        System.out.print("Even elements from array: ");
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbersOfArray(int[] array) {
        System.out.print("Odd elements from array: ");
        for (int element : array) {
            if (element % 2 != 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
