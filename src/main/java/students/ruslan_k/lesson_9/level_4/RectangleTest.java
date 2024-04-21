package students.ruslan_k.lesson_9.level_4;

public class RectangleTest {

    public static void main(String[] args) {
        double sideA = 2.0;
        double sideB = 3.0;
        double expPerimeter = 2.0 * (sideA + sideB);
        double expArea = sideA * sideB;
        Rectangle rectangle = new Rectangle("Rectangle", sideA, sideB);
        System.out.println("Class Rectangle, calculatePerimeter test - " + ((expPerimeter == rectangle.calculatePerimeter()) ? "Passed" : "Failed"));
        System.out.println("Class Rectangle, calculateArea test - " + ((expArea == rectangle.calculateArea()) ? "Passed" : "Failed"));
    }
}
