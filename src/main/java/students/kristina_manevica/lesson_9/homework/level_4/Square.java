package students.kristina_manevica.lesson_9.homework.level_4;

public class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        if (side == 0) {
            throw new ArithmeticException("Side cannot be zero!");
        }
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        if (side == 0) {
            throw new ArithmeticException("Side cannot be zero!");
        }
        return 4 * side;
    }
}