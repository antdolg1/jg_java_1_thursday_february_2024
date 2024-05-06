package students.kristina_manevica.lesson_9.homework.level_4;

public class Triangle extends Shape {

    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        if (side == 0) {
            throw new ArithmeticException("Side length cannot be zero!");
        }
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        if (side == 0) {
            throw new ArithmeticException("Side length cannot be zero!");
        }
        return 3 * side;
    }
}