package students.ruslan_k.lesson_2.level_1_intern;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input 1st INT: ");
        int firstInt = scan.nextInt();
        System.out.print("Please input 2nd INT: ");
        int secondInt = scan.nextInt();
        int resInt = firstInt + secondInt;
        System.out.println("Result of " + firstInt + "+" + secondInt + " is " + resInt);
        resInt = firstInt - secondInt;
        System.out.println("Result of " + firstInt + "-" + secondInt + " is " + resInt);

        System.out.println("Result of " + firstInt + "*" + secondInt + " is " + firstInt * secondInt);
        System.out.println("Result of " + firstInt + "/" + secondInt + " is " + firstInt / secondInt);
    }
}
