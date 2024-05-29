package students.ruslan_k.lesson_9.level_4;

public class Triangle extends Shape {
    private double side;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3.0) * side * side / 4.0;
    }

    @Override
    double calculatePerimeter() {
        return 3.0 * side;
    }
}
