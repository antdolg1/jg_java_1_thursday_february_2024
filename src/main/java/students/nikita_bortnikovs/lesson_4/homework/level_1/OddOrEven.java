package students.nikita_bortnikovs.lesson_4.homework.level_1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Please enter  number  and I will tell you whether it is odd or even number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
