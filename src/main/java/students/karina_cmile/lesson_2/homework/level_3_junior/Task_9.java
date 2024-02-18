package students.karina_cmile.lesson_2.homework.level_3_junior;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 9: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 9) {
            System.out.println("Wrong number!");
    }
        else {
            int mult1 = number * 1;
            int mult2 = number * 2;
            int mult3 = number * 3;
            int mult4 = number * 4;
            int mult5 = number * 5;
            int mult6 = number * 6;
            int mult7 = number * 7;
            int mult8 = number * 8;
            int mult9 = number * 9;

            System.out.println(number + " * 1 = " + mult1);
            System.out.println(number + " * 2 = " + mult2);
            System.out.println(number + " * 3 = " + mult3);
            System.out.println(number + " * 4 = " + mult4);
            System.out.println(number + " * 5 = " + mult5);
            System.out.println(number + " * 6 = " + mult6);
            System.out.println(number + " * 7 = " + mult7);
            System.out.println(number + " * 8 = " + mult8);
            System.out.println(number + " * 9 = " + mult9);
        }
    }
}
