package students.slava_subacius.lesson_4.level_3;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("largest number" + num1);
        } else if (num2 > num1 && num2 > num3 ) {
            System.out.println("largest number" + num2);
        } else {
            System.out.println("largest number" + num3);
        }
    }
}
