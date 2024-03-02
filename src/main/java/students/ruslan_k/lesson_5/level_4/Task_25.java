package students.ruslan_k.lesson_5.level_4;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        Scanner scan = new Scanner(System.in);
        int[] array;
        System.out.print("Please input the length of your array: ");
        array = arrayUtil.createArray(scan.nextInt());
        System.out.println("PLease be informed, that you ask to create Array with " + array.length + " INT elements");
        System.out.println("Prepare to input ALL of " + array.length + " elements");
        arrayUtil.fillArrayConsole(array);
        arrayUtil.printArrayToConsole(array);
    }

}
