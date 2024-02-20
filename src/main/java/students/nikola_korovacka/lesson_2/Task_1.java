package students.nikola_korovacka.lesson_2;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type first number: ");
        int first = scanner.nextInt();

        System.out.println("Type second number: ");
        int second = scanner.nextInt();

        int sum = first + second;
        int minus = first - second;
        int multiply = first * second;
        double dividing = (double) first / second;

        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + minus);
        System.out.println("Result of multiplying is : " + multiply);
        System.out.println("Result of dividing is : " + dividing);
    }

}
