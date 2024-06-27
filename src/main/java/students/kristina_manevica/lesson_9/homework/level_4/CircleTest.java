package students.kristina_manevica.lesson_9.homework.level_4;

public class CircleTest {

    public static void main(String[] args) {

        CircleTest circleTest = new CircleTest();

        circleTest.testArea();
        circleTest.testPerimeter();
        circleTest.testZeroPerimeter();
        circleTest.testZeroArea();
    }

    //попробовала что бы не париться со значениями после запятой в double
    public static void testArea() {
        String expectedResult = String.format("%.2f", 19.634954084936208);
        Circle circle = new Circle("Title", 2.5);

        double actualResult = circle.calculateArea();
        String formattedResult = String.format("%.2f", actualResult);
        System.out.println(formattedResult.equals(expectedResult) ? "testArea passed" : "testArea ERROR!");
    }

    public static void testPerimeter() {
        String expectedResult = String.format("%.2f", 15.707963267948966);
        Circle circle = new Circle("Title", 2.5);

        double actualResult = circle.calculatePerimeter();
        String formattedResult = String.format("%.2f", actualResult);
        System.out.println(formattedResult.equals(expectedResult) ? "testPerimeter passed" : "testPerimeter ERROR!");
    }

    public static void testZeroPerimeter() {
        Circle circle = new Circle("Title", 0);
        try {
            circle.calculatePerimeter();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

    public static void testZeroArea() {
        Circle circle = new Circle("Title", 0);
        try {
            circle.calculateArea();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}