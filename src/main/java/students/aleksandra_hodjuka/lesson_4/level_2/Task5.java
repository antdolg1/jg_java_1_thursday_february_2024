package students.aleksandra_hodjuka.lesson_4.level_2;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите любое целое число!");
        int A = scanner.nextInt();
        System.out.println("Пожалуйста, введите еще одно целое число!");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println(A);
        } else if (A < B) {
            System.out.println(B);

        } else {
            System.out.println("Неверное число!!!");
        }


    }
}
