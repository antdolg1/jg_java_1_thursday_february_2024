package students.aleksandra_hodjuka.lesson_4.Level_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите любое целое число!");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        if (number % 2 == 0) {
            System.out.println("Число четное!");
        } else {
            System.out.println("Число нечетное!");
        }


    }

}
