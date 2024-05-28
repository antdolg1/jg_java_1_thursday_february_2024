package students.arturs_novikovs.lesson_4.home_work;

import java.util.Scanner;
class TwoIntNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum1, userNum2;

        System.out.print("User one - enter your INT");
        userNum1 = scanner.nextInt();
        System.out.print("User two - enter your INT");
        userNum2 = scanner.nextInt();
        if (userNum1 == userNum2) {
            System.out.println("numbers are equal");
        } else if (userNum1 > userNum2) {
            System.out.printf("%s is greater \n", userNum1);
        } else {
            System.out.printf("%s is greater \n", userNum2);
        }
    }
}
