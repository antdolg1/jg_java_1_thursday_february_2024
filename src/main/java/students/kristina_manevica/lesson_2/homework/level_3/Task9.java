package students.kristina_manevica.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        int i;

        System.out.print("Input a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
