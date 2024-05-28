package students.igors_melkins.lesson_4.level_1;

import students.kristina_manevica.lesson_2.homework.level_7.SystemUnit;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите любое четное число");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2==0){
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное ");
        }
    }
}
