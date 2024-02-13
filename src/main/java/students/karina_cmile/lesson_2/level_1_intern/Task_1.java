package students.karina_cmile.lesson_2.level_1_intern;

import java.net.SocketOption;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.print("Enter value of a: ");
        Scanner scanner = new Scanner(System.in);
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
