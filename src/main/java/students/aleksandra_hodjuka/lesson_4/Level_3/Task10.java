package students.aleksandra_hodjuka.lesson_4.Level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first number!");
        int A = scanner.nextInt();
        System.out.println("Please, enter the second number!");
        int B = scanner.nextInt();
        System.out.println("Please, enter the third number!");
        int C = scanner.nextInt();

        if (A > B && A > C) {
            System.out.println(A);
        } else if (B > A && B > C) System.out.println(B);
        else if (C > A && C > B) System.out.println(C);


    }
}
