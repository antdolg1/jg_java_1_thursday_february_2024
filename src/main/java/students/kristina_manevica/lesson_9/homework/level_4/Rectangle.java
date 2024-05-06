package students.kristina_manevica.lesson_9.homework.level_4;

public class Rectangle extends Shape {

    private double sideShort;
    private double sideLong;

    public Rectangle(String title, double sideShort, double sideLong) {
        super(title);
        this.sideShort = sideShort;
        this.sideLong = sideLong;
    }

    @Override
    double calculateArea() {
        if (sideLong == 0 || sideShort == 0) {
            throw new ArithmeticException("Side cannot be zero!");
        }
        return sideShort * sideLong;
    }

    @Override
    double calculatePerimeter() {
        if (sideLong == 0 || sideShort == 0) {
            throw new ArithmeticException("Side cannot be zero!");
        }
        return 2 * (sideLong + sideShort);
    }
}