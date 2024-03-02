package students.ruslan_k.lesson_5.level_4;


import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayUtil arrayUtil=new ArrayUtil();
        int[] array;
        System.out.print("Please input the length of your array: ");
        array = arrayUtil.createArray(scan.nextInt());
        System.out.println("PLease be informed, that you ask to create Array with " + array.length + " INT elements");
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
    }
}
