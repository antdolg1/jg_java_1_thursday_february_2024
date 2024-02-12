package students.nikita_bortnikovs.lesson_2.level_3;

import java.util.Scanner;

public class level_3_3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 3 random number one by one ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double med = (double) (a + b + c) /3;
        System.out.println("Median of your numbers ("+a+","+b+" and "+c+") is equal to " + med);

    }
}
