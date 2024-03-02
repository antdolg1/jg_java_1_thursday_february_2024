package students.ruslan_k.lesson_5.level_4;


import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength;
        int[] array;
        System.out.print("Please input the length of your array: ");
        arrayLength = scan.nextInt();
        array = new int[arrayLength];
        System.out.println("PLease be informed, that you ask to create Array with " + arrayLength + " INT elements");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int)(Math.random()*1000);
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Array element #%s is %s\n", i+1, array[i]);
        }
    }
}
