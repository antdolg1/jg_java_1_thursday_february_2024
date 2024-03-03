package students.slava_subacius.lesson_4.level_3;

import java.util.Scanner;

public class DecreasingAndIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
