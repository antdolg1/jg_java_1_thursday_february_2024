package students.ruslan_k.lesson_2.level_1_intern;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input 1st DBL: ");
        double a = scan.nextDouble();
        System.out.print("Please input 2nd DBL: ");
        double b = scan.nextDouble();
        double c=a+b;
        System.out.println("Result of " + a + "+" + b + " is " + c);
        c=a-b;
        System.out.println("Result of " + a + "-" + b + " is " + c);

        System.out.println("Result of " + a + "*" + b + " is " + a*b);
        System.out.println("Result of " + a + "/" + b + " is " + a/b);

    }
}
