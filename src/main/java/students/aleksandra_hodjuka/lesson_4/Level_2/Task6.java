package students.aleksandra_hodjuka.lesson_4.Level_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите любое целое число!");
        int A = scanner.nextInt();
        System.out.println("Пожалуйста, введите еще одно целое число!");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println(B);
        } else if (A < B) {
            System.out.println(A);

        } else
            System.out.println("Неверное число!!!");


    }
}
