package students.karina_cmile.lesson_2.homework.level_1_intern;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double c = scanner.nextDouble();
        System.out.print("Enter the second value: ");
        double d = scanner.nextDouble();

        double sum = c + d;
        double sub = c - d;
        double mult = c * d;
        double div = (double) c / d;

        System.out.println("Sum c and d is "+ sum);
        System.out.println("Subtraction c and d is "+ sub);
        System.out.println("Multiplying c and d is "+ mult);
        System.out.println("Division c and d is "+ div);

    }

}
