package students.ruslan_k.lesson_5.level_4;

import java.util.Scanner;
import java.util.Random;

class ArrayUtil {
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    public int[] createArray(int arrayLength) {
        if (arrayLength >= 0) {
            return new int[arrayLength];
        }
        System.out.println("Array Length can't be Negative");
        return new int[0];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();

        }

    }

    public void printArrayToConsole(int[] array) {
        for (int result : array) {
            System.out.println(result);
        }
    }

    public int findMaxNumber(int[] array) {
        if (array.length != 0) {
            int result = array[0];
            for (int currentItem : array) {
                if (result < currentItem) {
                    result = currentItem;
                }
            }
            return result;
        } else {
            System.out.println("It's Zero-Length array");
            return -1;
        }
    }

    public int findMinNumber(int[] array) {
            int result = array[0];
            for (int currentItem : array) {
                if (result > currentItem) {
                    result = currentItem;
                }
            }
            return result;
    }

    public void fillArrayConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please input element #" + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
    }
    public void listEvenElements(int[] array){
        System.out.println("List of even elements:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.printf("#%s - %s \n", i + 1, array[i]);
            }
        }
    }
    public void listOddElements(int[] array){
        System.out.println("List of odd elements:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.printf("#%s - %s \n", i + 1, array[i]);
            }
        }
    }
}
