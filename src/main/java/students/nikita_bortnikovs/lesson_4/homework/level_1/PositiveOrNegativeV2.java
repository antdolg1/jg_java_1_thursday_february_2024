package students.nikita_bortnikovs.lesson_4.homework.level_1;

import java.util.Scanner;

public class PositiveOrNegativeV2 {
    public static void main(String[] args) {
        System.out.println("Please enter whole  number and I will tell  you whether it is  nagative , positive or equals zero ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 1 == 0 && number > 0) {
            System.out.println("Your whole number is positive");
        } else if (number % 1 == 0 && number < 0) {
            System.out.println("Your whole number is negative");
        } else if (number % 1 == 0 && number == 0) {
            System.out.println("Entered number is zero");
        } else {
            System.out.println("Number is not recognised");
        }
    }
}
