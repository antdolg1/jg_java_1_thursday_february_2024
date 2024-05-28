package students.ruslan_k.lesson_9.level_4;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;


    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return 2.0 * (sideA + sideB);
    }


}
