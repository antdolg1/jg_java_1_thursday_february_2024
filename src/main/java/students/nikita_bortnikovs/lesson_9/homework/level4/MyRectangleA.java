package students.nikita_bortnikovs.lesson_9.homework.level4;

public class MyRectangleA extends Rectangle {

    public MyRectangleA(String title, double sideA, double sideB) {
        super(title, sideA, sideB);
    }

    @Override
    public  double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }
}
