package students.ruslan_k.lesson_9.level_4;

public class SquareTest {

    public static void main(String[] args) {


        double side = 2.0;
        double expPerimeter   = 4.0 * side;
        double expArea = side * side;
        Square square = new Square("Circle", side);
        System.out.println("Class Square, calculatePerimeter test - " + ((expPerimeter == square.calculatePerimeter()) ? "Passed" : "Failed"));
        System.out.println("Class Square, calculateArea test - " + ((expArea == square.calculateArea()) ? "Passed" : "Failed"));
    }
}
