package students.nikola_korovacka.lesson_2;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type first number: ");
        double first = scanner.nextDouble();

        System.out.println("Type second number: ");
        double second = scanner.nextDouble();

        double sum = first + second;
        double minus = first - second;
        double multiply = first * second;
        double dividing = first / second;

        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + minus);
        System.out.println("Result of multiplying is : " + multiply);
        System.out.println("Result of dividing is : " + dividing);
    }
}
