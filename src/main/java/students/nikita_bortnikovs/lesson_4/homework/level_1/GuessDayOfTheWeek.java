package students.nikita_bortnikovs.lesson_4.homework.level_1;

import java.util.Scanner;

public class GuessDayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Please enter  number from 1-7 to get your day of the week ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 1 == 0 && number == 1) {
            System.out.println("Your number is Mon");
        } else if (number % 1 == 0 && number == 2) {
            System.out.println("Your number is Tue");
        } else if (number % 1 == 0 && number == 3) {
            System.out.println("Your number is Wed");
        } else if (number % 1 == 0 && number == 4) {
            System.out.println("Your number is Thu");
        } else if (number % 1 == 0 && number == 5) {
            System.out.println("Your number is Fri");
        } else if (number % 1 == 0 && number == 6) {
            System.out.println("Your number is Sat");
        } else if (number % 1 == 0 && number == 7) {
            System.out.println("Your number is Sun");
        } else if (number % 1 == 0 && number == 0) {
            System.out.println("Your number is zero");
        } else if (number == 0 && number > 7) {
            System.out.println("No such day of the week known yet");
        } else {
            System.out.println("Hm...Something went wrong");
        }
    }
}
