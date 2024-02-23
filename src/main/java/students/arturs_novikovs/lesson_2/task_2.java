package students.arturs_novikovs.lesson_2;

import java.util.Scanner;
public class task_2{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();
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
