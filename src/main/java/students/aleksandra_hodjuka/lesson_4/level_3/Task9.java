package students.aleksandra_hodjuka.lesson_4.level_3;

import java.util.Scanner;

 class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first number!");
        int A = scanner.nextInt();
        System.out.println("Please, enter the second number!");
        int B = scanner.nextInt();
        System.out.println("Please, enter the third number!");
        int C = scanner.nextInt();

        if (A < B && B < C) {
            System.out.println("increasing");
        } else if (A > B && B > C) System.out.println("decreasing");

         else {
            System.out.println("Neither increasing or decreasing order");
        }




    }
}
