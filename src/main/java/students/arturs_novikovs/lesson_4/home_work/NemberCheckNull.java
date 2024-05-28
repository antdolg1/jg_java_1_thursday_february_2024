package students.arturs_novikovs.lesson_4.home_work;

import java.util.Scanner;

public class NemberCheckNull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt;
        System.out.println("Please enter your INT");
        userInt = scanner.nextInt();
        if (userInt > 0) {
            System.out.printf("%s is positive numbers \n", userInt);
        }
        else if (userInt < 0) {
            System.out.printf("%s is negative numbers \n", userInt);
        }
        else {
            System.out.printf("Bro, %s is an zero \n", userInt);
        }
    }
}

