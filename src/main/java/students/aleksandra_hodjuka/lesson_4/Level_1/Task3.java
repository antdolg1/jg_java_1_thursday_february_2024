package students.aleksandra_hodjuka.lesson_4.Level_1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Пожалуйста, введите любое целое число от 1 до 7!");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Понедельник!");
        } else if (number == 2) {
            System.out.println("Вторник!");
        } else if (number == 3) {
            System.out.println("Среда!");
        } else if (number == 4) {
            System.out.println("Четверг!");
        } else if (number == 5) {
            System.out.println("Пятница!");
        } else if (number == 6) {
            System.out.println("Суббота!!");
        } else if (number == 7) {
            System.out.println("Воскресенье!");
        } else {
            System.out.println("Неверное число!");
        }
    }
}
