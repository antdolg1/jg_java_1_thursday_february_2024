package students.ruslan_k.lesson_9.level_4;

class Square extends Shape {

    private double side;


    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4.0 * side;
    }


}