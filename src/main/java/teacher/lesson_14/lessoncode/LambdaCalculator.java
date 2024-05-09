package teacher.lesson_14.lessoncode;

public class LambdaCalculator {
    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation subtract = (x, y) -> x - y;

        System.out.println("Sum: " + add.execute(5, 3));
        System.out.println("Subtract: " + subtract.execute(5, 3));
    }

}
