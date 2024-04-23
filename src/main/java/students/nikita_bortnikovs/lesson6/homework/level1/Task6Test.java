package students.nikita_bortnikovs.lesson6.homework.level1;

import java.util.Scanner;

public class Task6Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter integer for test");
        int testNumber = scanner.nextInt();

        if (testNumber % 2 == 0) {
            boolean expectedResult = true;
            System.out.println(testNumber+ " divides by 2 so the test is passed ✔ ️. Result is " + expectedResult );
        }
        else if (testNumber % 2 != 0) {
            boolean expectedResult = false;
            System.out.println(testNumber+ " cannot be divided by 2 so the test is passed ️✔. Result is " + expectedResult );
        }else {
            System.out.println("Test failed ❌");
        }
    }
}
