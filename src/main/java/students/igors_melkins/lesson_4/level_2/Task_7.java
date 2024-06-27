package students.igors_melkins.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число ");
        int A = scanner.nextInt();
        System.out.println("Введите еще одно целое число");
        int B = scanner.nextInt();

        if (A == B){
            System.out.println("Numbers are equals");
        } else  {
            System.out.println("Numbers are different");
        }
    }
}
