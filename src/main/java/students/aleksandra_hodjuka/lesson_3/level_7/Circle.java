package students.aleksandra_hodjuka.lesson_3.level_7;

public class Circle {
    double radius;
    double p;

    public Circle(double radius, double p) {
        this.radius = radius;
        this.p = 3.14;
    }

    double calculateArea = p*radius*radius;

    public double getCalculateArea() {return calculateArea;}
}
