package students.karina_cmile.lesson_6.level_3_junior;

import teacher.lesson_6.lessoncode.CustomArrayUtils;

import java.util.Random;
import java.util.Scanner;

public class ArrayService {

    static int[] createArray(int arrLength) {
        return new int[arrLength];
    }
    static int getArrayLengthFromUser() {
        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    static void fillArrayWithRandomNumbers(int[] arrToFill) {
        Random random = new Random();
        for (int i = 0; i < arrToFill.length; i++) {
            arrToFill[i] = random.nextInt();
        }
    }
    static void printArrToConsole(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void numberToSearch () {
        System.out.println("Enter the number to search: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
    }

    public static boolean containsIntValue (int[] arr, int number) {
        for (int element: arr){
          if (number == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arrLength = ArrayService.getArrayLengthFromUser();
        int[] arr = ArrayService.createArray(arrLength);
        ArrayService.fillArrayWithRandomNumbers(arr);
        ArrayService.printArrToConsole(arr);
        ArrayService.numberToSearch();
//        ArrayService.containsIntValue(); - не получилось вызвать метод. Не могу понять, где ошибка.
    }

}
