package students.kristina_manevica.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius value (double): ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Radius = " + radius);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Areas is = " + area);
    }
}
