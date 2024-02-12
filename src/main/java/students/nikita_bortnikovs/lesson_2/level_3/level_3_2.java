package students.nikita_bortnikovs.lesson_2.level_3;

import java.util.Scanner;

public class level_3_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Please enter here your radius to see the perimeter and area of the circle...");
        double rad = scanner.nextDouble();
        double per = 2*3.14*rad;
        double ar = 3.14*Math.pow(rad, 2);

        System.out.println("Your perimeter is  " + per+" cm");
        System.out.println("Your area is  " + ar+" cm");


    }
}
