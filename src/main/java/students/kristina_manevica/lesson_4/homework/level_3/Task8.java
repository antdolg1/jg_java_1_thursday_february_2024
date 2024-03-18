package students.kristina_manevica.lesson_4.homework.level_3;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree) {
            System.out.println("All numbers are different");
        } else System.out.println("Neither all are equal or different");
    }
}
