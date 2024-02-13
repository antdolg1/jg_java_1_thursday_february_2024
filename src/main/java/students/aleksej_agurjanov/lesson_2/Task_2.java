package students.aleksej_agurjanov.lesson_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double firstDoubleNumber = scanner.nextDouble();
        Double secondDoubleNumber = scanner.nextDouble();
        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mult = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Sum :" + sum);
        System.out.println("Sub :" +sub);
        System.out.println("Mult :" + mult);
        System.out.println("div :" + div);

    }
}
