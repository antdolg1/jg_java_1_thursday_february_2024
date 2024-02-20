package students.ruslan_k.lesson_3.level_7;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4.56);
        Scanner scan= new Scanner(System.in);

        System.out.println(circle.calculateArea());
        System.out.print("Input radius: ");
        double rad=scan.nextDouble();
        circle.setRadius(rad);
        System.out.println(circle.calculateArea());

    }
}
