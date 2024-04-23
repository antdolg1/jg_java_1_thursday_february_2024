package students.igors_melkins.lesson_4.level_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_4 {
    public static void main (String [] args ){
        System.out.println("Пожалуйста ввидите любое целое число");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0 ){
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

}
