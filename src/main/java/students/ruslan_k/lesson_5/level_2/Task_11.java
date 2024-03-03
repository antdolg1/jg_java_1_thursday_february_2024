package students.ruslan_k.lesson_5.level_2;

import java.util.Scanner;

class ArrayFillsWithConsoleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for(int i=0; i< array.length; i++){
            System.out.print("Please input new Int: ");
            array[i]=scan.nextInt();
            System.out.printf("New Array Element is %s\n", array[i]);
        }
    }
}
