package students.slava_subacius.lesson_4.level_1;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer from 1 to 7 : ");
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The number entered is incorrect");
        }
    }
}


