package students.nikita_bortnikovs.lesson_9.homework.level4;

public class CircleDemo extends Shape {


    CircleDemo(String title) {
        super(title);
    }

    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Creating an instance of Circle
        double area = circle.calculateArea(); // Calculating the area
        double perimeter = circle.calculatePerimeter(); // Calculating the perimeter

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

    }
}
