package students.karina_cmile.lesson_2.homework.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();



        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        double div = (double) a / b;

        System.out.println("Sum a and b is "+ sum);
        System.out.println("Subtraction a and b is "+ sub);
        System.out.println("Multiplying a and b is "+ mult);
        System.out.println("Division a and b is "+ div);

    }
}
