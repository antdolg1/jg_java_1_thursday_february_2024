package students.kristina_manevica.lesson_6.homework.level_1;

public class NumberUtilsTest {

    static int number = 6;
    static boolean expectedResult = true;

    public static void main(String[] args) {

        System.out.println((NumberUtils.isEven(number) == expectedResult) ? "Number " + number + " is even" : "Number "
                + number + " is not even");
    }
}
