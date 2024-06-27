package students.kristina_manevica.lesson_9.homework.level_4;

public class TriangleTest {

    public static void main(String[] args) {

        TriangleTest triangleTest = new TriangleTest();

        triangleTest.testArea();
        triangleTest.testPerimeter();
        triangleTest.testZeroPerimeter();
        triangleTest.testZeroArea();
    }

    //попробовала что бы не париться со значениями после запятой в double
    static void testArea() {
        String expectedResult = String.format("%.2f", 2.7063293868263707);
        Triangle triangle = new Triangle("Title", 2.5);

        double actualResult = triangle.calculateArea();
        String formattedResult = String.format("%.2f", actualResult);
        System.out.println(formattedResult.equals(expectedResult) ? "testArea passed" : "testArea ERROR!");
    }

    static void testPerimeter() {
        String expectedResult = String.format("%.2f", 7.5);
        Triangle triangle = new Triangle("Title", 2.5);

        double actualResult = triangle.calculatePerimeter();
        String formattedResult = String.format("%.2f", actualResult);
        System.out.println(formattedResult.equals(expectedResult) ? "testPerimeter passed" : "testPerimeter ERROR!");
    }

    public static void testZeroPerimeter() {
        Triangle triangle = new Triangle("Title", 0);
        try {
            triangle.calculatePerimeter();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

    public static void testZeroArea() {
        Triangle triangle = new Triangle("Title", 0);
        try {
            triangle.calculateArea();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}