package students.arturs_novikovs.lesson_2;

import java.util.Scanner;
public class Task_2{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число.");
    double firstDoubleNumber = scanner.nextDouble();
    System.out.println("Введите второе число");
    double secondDoubleNember = scanner.nextDouble();
    double sum = firstDoubleNumber + secondDoubleNember;
    double sub = firstDoubleNumber - secondDoubleNember;
    double mult = firstDoubleNumber * secondDoubleNember;
    double div = firstDoubleNumber / secondDoubleNember;

    System.out.println("Sum :" + sum);
    System.out.println("Sub :" + sub);
    System.out.println("Mult :" + mult);
    System.out.println("Div :" +div);
    }
}
