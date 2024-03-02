package students.ruslan_k.lesson_5.level_4;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength;
        int[] array;
        System.out.print("Please input the length of your array: ");
        arrayLength = scan.nextInt();
        array = new int[arrayLength];
        System.out.println("PLease be informed, that you ask to create Array with " + arrayLength + " INT elements");
        System.out.println("Prepare to input ALL of " + arrayLength + " elements");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please input element #" + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
        for (int element: array){
            System.out.println(element);
        }
    }

}
