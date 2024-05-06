package students.kristina_manevica.lesson_9.homework.level_4;

public class RectangleTest {

    public static void main(String[] args) {

        RectangleTest test = new RectangleTest();

        test.testArea();
        test.testPerimeter();
        test.testZeroPerimeter();
        test.testZeroArea();
    }

    public static void testArea() {
        String expectedResult = String.format("%.2f", 7.3125);
        Rectangle rectangle = new Rectangle("Title1", 2.25, 3.25);

        double actualResult = rectangle.calculateArea();
        String formattedResult = String.format("%.2f", actualResult);
        System.out.println(formattedResult.equals(expectedResult) ? "testArea passed" :
                "testArea ERROR!");
    }

    public static void testPerimeter() {
        String expectedResult = String.format("%.2f", 12.12);
        Rectangle rectangle = new Rectangle("Title2", 3.02, 3.04);

        double actualResult = rectangle.calculatePerimeter();
        String formattedResult = String.format("%.2f", actualResult);
        System.out.println(formattedResult.equals(expectedResult) ? "testPerimeter passed" :
                "testPerimeter ERROR!");
    }

    public static void testZeroPerimeter() {
        Rectangle rectangle = new Rectangle("Title", 0, 3.04);
        try {
            rectangle.calculatePerimeter();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

    public static void testZeroArea() {
        Rectangle rectangle = new Rectangle("Title", 2.0, 0);
        try {
            rectangle.calculateArea();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}