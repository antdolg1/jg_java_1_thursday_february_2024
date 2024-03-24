package students.aleksandra_hodjuka.lesson_2.level_3;

import java.util.Scanner;

 class Task_10 {
    public static void main(String[] args) {
        double p = 3.14;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int R = scanner.nextInt();

         double perimeter = 2 * p * R;
         double area = p * R * R;


        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);




    }
}
