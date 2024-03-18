package students.karina_cmile.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

//        int dayOfTheWeek = 4;
//
//        switch (dayOfTheWeek) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Are you from this planet?");
//        }

        System.out.println("Please input number from 1 to 6:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1:
            case 2:
                System.out.println("Junior");
                break;
            case 3:
                System.out.println("Middle");
                break;
            case 4:
            case 5:
                System.out.println("Senior");
                break;
            case 6:
                System.out.println("Solution architect");
                break;
            default:
                System.out.println("Wrong number entered");
        }

        //enhanced switch statement, available since java 13 or 17 idk
//        switch (inputNumber) {
//            case 1, 2 -> System.out.println("Junior");
//            case 3 -> System.out.println("Middle");
//            case 4, 5 -> System.out.println("Senior");
//            case 6 -> System.out.println("Solution architect");
//            default -> System.out.println("Wrong number entered");
//        }
    }
}
