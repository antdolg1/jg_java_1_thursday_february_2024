package students.ruslan_k.lesson_9.level_4;

public class TriangleTest {
    public static void main(String[] args) {
        double side = 4.0;
        double expPerimeter = 3.0 * side;
        double expArea = Math.sqrt(3.0) * side * side / 4.0;
        Triangle triangle = new Triangle("Triangle", side);
        System.out.println("Class Triangle, calculatePerimeter test - " + ((expPerimeter == triangle.calculatePerimeter()) ? "Passed" : "Failed"));
        System.out.println("Class Triangle, calculateArea test - " + ((expArea == triangle.calculateArea()) ? "Passed" : "Failed"));
    }
}
