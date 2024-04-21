package students.ruslan_k.lesson_9.level_4;

public class ShapeUtilTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle",1);
        shapes[1] = new Square("Square",1);
        shapes[2] = new Rectangle("Rectangle",1, 1);
        shapes[3] = new Triangle("Triangle",1);
        ShapeUtil shapeUtil= new ShapeUtil();
        double totalArea = shapeUtil.calculateArea(shapes);
        double totalPerimeter = shapeUtil.calculatePerimeter(shapes);
        double cArea= shapeUtil.calculateArea(shapes[0]);
        double cPerim = shapeUtil.calculatePerimeter(shapes[0]);
        double sArea = shapeUtil.calculateArea(shapes[1]);
        double sPerim = shapeUtil.calculatePerimeter(shapes[1]);
        double rArea =  shapeUtil.calculateArea(shapes[2]);
        double rPerim =  shapeUtil.calculatePerimeter(shapes[2]);
        double tArea = shapeUtil.calculateArea(shapes[3]);
        double tPerim =  shapeUtil.calculatePerimeter(shapes[3]);
        double expectArea = cArea+sArea+rArea+tArea;
        double expectPerimeter = cPerim+sPerim+rPerim+tPerim;

        System.out.printf("Test of \"Total Area of all shapes\" is %s\n", totalArea==expectArea ? "Passed": "Failed" );
        System.out.printf("Test of \"Total Perimeter of all shapes\" is %s \n", totalPerimeter==expectPerimeter? "Passed": "Failed");

    }
}
