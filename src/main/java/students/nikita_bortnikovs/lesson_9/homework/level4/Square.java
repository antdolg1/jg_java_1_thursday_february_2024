package students.nikita_bortnikovs.lesson_9.homework.level4;

public class Square extends Shape{
    private double cubeSide;

    Square(double cubeSide) {
        super("Square");
        this.cubeSide = cubeSide;
    }

    @Override
    double calculateArea() {
        return cubeSide*cubeSide;
    }

    @Override
    double calculatePerimeter() {
        return cubeSide*4;
    }
}
