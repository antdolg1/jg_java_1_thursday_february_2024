package teacher.lesson_10.lessoncode;

public class MathUtils {

    //method overloading or перегрузка методов
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int calculate(int a, String b) {
        return a;
    }

    public int calculate(String b, int a) {
        return a;
    }
}
