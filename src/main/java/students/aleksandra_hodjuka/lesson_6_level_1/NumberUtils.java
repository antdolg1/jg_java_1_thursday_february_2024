package students.aleksandra_hodjuka.lesson_6_level_1;

public class NumberUtils {

    int number;

    public static boolean isEven(int number) {
        return number % 2 == 0;

    }

    public void testIsEvenWithNegativeEvenNumber() {
        assertTrue(NumberUtils.isEven(-6));
    }

    public void testIsEvenWithZero() {
        assertTrue(NumberUtils.isEven(0));
    }

    public void testIsEvenWithNegativeOddNumber() {
        assertFalse(NumberUtils.isEven(-3));
    }

    public void testIsEvenWithEvenNumber() {
        assertTrue(NumberUtils.isEven(4));
    }

    public void testIsEvenWithOddNumber() {
        assertFalse(NumberUtils.isEven(7));
    }

    private static void assertTrue(boolean even) {

    }

    private static void assertFalse(boolean even) {
    }
}