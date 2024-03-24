package students.aleksandra_hodjuka.lesson_4.level_3;

import java.util.Scanner;

 class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first number!");
        int A = scanner.nextInt();
        System.out.println("Please, enter the second number!");
        int B = scanner.nextInt();
        System.out.println("Please, enter the third number!");
        int C = scanner.nextInt();

        if (A == B && A == C) {
            System.out.println("All numbers are equal");
        } else if (A != B && A != C) System.out.println("All numbers are different");
        else if (A != B && B != C) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }


    }
}
