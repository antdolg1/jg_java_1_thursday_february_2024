package students.kristina_manevica.lesson_9.homework.level_4;

public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() throws ArithmeticException {
        if (radius == 0) {
            throw new ArithmeticException("Radius cannot be zero!");
        }
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() throws ArithmeticException {
        if (radius == 0) {
            throw new ArithmeticException("Radius cannot be zero!");
        }
        return 2 * Math.PI * radius;
    }
}