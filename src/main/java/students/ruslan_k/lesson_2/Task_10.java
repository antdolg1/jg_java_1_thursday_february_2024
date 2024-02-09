// also Task_15
package students.ruslan_k.lesson_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius : ");
        double radius= scan.nextDouble();
        System.out.println("Perimeter is: " + 2*Math.PI*radius);
        System.out.println("Area is: " + Math.PI*Math.pow(radius,2));
    }
}
