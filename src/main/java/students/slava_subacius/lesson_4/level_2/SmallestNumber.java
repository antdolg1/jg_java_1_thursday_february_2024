package students.slava_subacius.lesson_4.level_2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number : ");
        int num1 = scanner.nextInt();
        System.out.println("Input the number : ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("Smallest number" + num1);
        } else if (num2 < num1) {
            System.out.println("Smallest number" + num2);
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
