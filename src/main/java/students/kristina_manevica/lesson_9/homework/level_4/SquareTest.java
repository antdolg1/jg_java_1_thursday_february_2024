package students.kristina_manevica.lesson_9.homework.level_4;

public class SquareTest {
    public static void main(String[] args) {

        SquareTest squareTest = new SquareTest();

        squareTest.testArea();
        squareTest.testPerimeter();
        squareTest.testZeroPerimeter();
        squareTest.testZeroArea();
    }

    public static void testArea() {
        double expectedResult = 6.25;
        Square square = new Square("Title", 2.5);

        double actualResult = square.calculateArea();
        System.out.println((actualResult == expectedResult) ? "testArea passed" : "testArea ERROR!");
    }

    public static void testPerimeter() {
        double expectedResult = 10.0;
        Square square = new Square("Title", 2.5);

        double actualResult = square.calculatePerimeter();
        System.out.println((actualResult == expectedResult) ? "testPerimeter passed" : "testPerimeter ERROR!");
    }

    public static void testZeroPerimeter() {
        Square square = new Square("Title", 0);
        try {
            square.calculatePerimeter();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

    public static void testZeroArea() {
        Square square = new Square("Title", 0);
        try {
            square.calculateArea();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}