package students.nikita_bortnikovs.lesson_9.homework.level4;

abstract class Rectangle extends Shape {

    protected double sideA;
    protected double sideB;

    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}