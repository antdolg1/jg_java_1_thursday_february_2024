package students.kristina_manevica.lesson_4.homework.level_3;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("increasing");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("decreasing");
        } else System.out.println("Neither increasing or decreasing order");
    }
}
