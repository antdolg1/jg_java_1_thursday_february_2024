package students.arturs_novikovs.lesson_2;

import java.util.Scanner;
public class Task_2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число.");
    double firstNumber = scanner.nextDouble();
    System.out.println("Введите второе число");
    double secondNumber = scanner.nextDouble();
    double sum = firstNumber + secondNumber;
    double sub = firstNumber - secondNumber;
    double mult = firstNumber * secondNumber;
    double div = firstNumber / secondNumber;

    System.out.println("Sum :" + sum);
    System.out.println("Sub :" + sub);
    System.out.println("Mult :" + mult);
    System.out.println("Div :" +div);
    }
}
