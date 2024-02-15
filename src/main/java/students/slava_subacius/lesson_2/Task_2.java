package students.slava_subacius.lesson_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();
        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mult = firstDoubleNumber *  secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Sum : " + sum);
        System.out.println("Subtraction : " + sub);
        System.out.println("Multiplication : " + mult);
        System.out.println("Division : " + div);


    }
}
