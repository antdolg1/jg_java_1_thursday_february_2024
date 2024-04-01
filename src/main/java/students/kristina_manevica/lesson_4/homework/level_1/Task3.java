package students.kristina_manevica.lesson_4.homework.level_1;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {

        System.out.println("Enter int number from 1 to 7:");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        switch (userNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Check your number!");
        }
    }
}
