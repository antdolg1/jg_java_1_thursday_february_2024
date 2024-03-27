package students.kristina_manevica.lesson_4;

import java.util.Scanner;

class Switch {
    public static void main(String[] args) {

        int dayOfTheWeek = 10;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Yes!");
                break;
            default:
                System.out.println("No day");
        }

        System.out.println("input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1:
            case 2:
                System.out.println("Junior");
                break;
            default:
                System.out.println("Middle");
        }

        //enhanced switch statement
        switch (inputNumber){
            case 1,2 -> System.out.println("Junior");
            default -> System.out.println("Middle");
        }
    }
}
