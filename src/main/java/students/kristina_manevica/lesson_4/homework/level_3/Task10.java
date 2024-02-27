package students.kristina_manevica.lesson_4.homework.level_3;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {

        System.out.println("Enter three int numbers:");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("All are the same: " + numberOne);
        } else if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println(numberOne);
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.println(numberTwo);
        } else {
            System.out.println(numberThree);
        }
    }
}
