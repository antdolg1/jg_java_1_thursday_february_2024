package students.ruslan_k.lesson_9.level_4;

import java.util.Random;

public class ShapeUtil {
    Random rnd = new Random();
    int boundForRnd = 100;

    Circle createRandomCircle() {
        return new Circle("Circle", rnd.nextDouble(boundForRnd));
    }

    Square createRandomSquare() {
        return new Square("Square", rnd.nextDouble(boundForRnd));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", rnd.nextDouble(boundForRnd), rnd.nextDouble(boundForRnd));
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", rnd.nextDouble(boundForRnd));
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape element : shapes) {
            totalArea += element.calculateArea();
        }
        return totalArea;
    }
    double calculatePerimeter(Shape[] shapes){
        double totalPerimeter = 0;
        for (Shape element : shapes) {
            totalPerimeter += element.calculatePerimeter();
        }
        return totalPerimeter;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
