package students.aleksandra_hodjuka.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first number!");
        int A = scanner.nextInt();
        System.out.println("Please, enter the second number!");
        int B = scanner.nextInt();

        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;

        System.out.println(STR."The sum of numbers is \{sum}");
        System.out.println(STR."The subtraction of numbers is \{sub}");
        System.out.println(STR."The multiplication of numbers is \{mul}");
        System.out.println(STR."The division of numbers is \{div}");


    }
}
