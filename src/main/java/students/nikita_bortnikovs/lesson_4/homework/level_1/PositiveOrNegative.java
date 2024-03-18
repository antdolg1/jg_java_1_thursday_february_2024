package students.nikita_bortnikovs.lesson_4.homework.level_1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Please enter number and I will tell  you whether it is  nagative or positive ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("Your number is positive or zero");
        } else {
            System.out.println("Your number is negative");
        }
    }
}
