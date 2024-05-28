package students.ruslan_k.lesson_9.level_4;

class CircleTest {

    public static void main(String[] args) {

        double radius = 2.0;
        double expPerimeter = Math.PI * 2 * radius;
        double expArea = Math.PI * radius * radius;
        Circle circle = new Circle("Circle", radius);
        System.out.println("Class Circle, calculatePerimeter test - " + ((expPerimeter == circle.calculatePerimeter()) ? "Passed" : "Failed"));
        System.out.println("Class Circle, calculateArea test - " + ((expArea == circle.calculateArea()) ? "Passed" : "Failed"));


    }

}
