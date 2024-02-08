package students.ruslan_k.lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input 1st INT: ");
        int a = scan.nextInt();
        System.out.print("Please input 2nd INT: ");
        int b = scan.nextInt();
        int c=a+b;
        System.out.println("Result of " + a + "+" + b + " is " + c);
        c=a-b;
        System.out.println("Result of " + a + "-" + b + " is " + c);

        System.out.println("Result of " + a + "*" + b + " is " + a*b);
        System.out.println("Result of " + a + "/" + b + " is " + a/b);

    }
}
