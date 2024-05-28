package students.ruslan_k.lesson_9.level_4;

public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

        System.out.printf("Area & Perimeter of random Circle was %5.2f & %6.2f\n", circlePerimeter, circleArea);
        System.out.printf("Area & Perimeter of random Square was %5.2f & %6.2f\n", squarePerimeter, squareArea);
        System.out.printf("Area & Perimeter of random Rectangle was %5.2f & %6.2f\n", rectanglePerimeter, rectangleArea);
        System.out.printf("Area & Perimeter of random Triangle was %5.2f & %6.2f\n ", trianglePerimeter, triangleArea);


    }
}
