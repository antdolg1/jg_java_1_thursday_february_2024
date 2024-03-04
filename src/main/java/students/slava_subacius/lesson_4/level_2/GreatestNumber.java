package students.slava_subacius.lesson_4.level_2;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number : ");
        int number1 = scanner.nextInt();
        System.out.println("Input the number : ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Greatest number" + number1);
        } else if (number2 > number1) {
            System.out.println("Greatest number" + number2);
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
