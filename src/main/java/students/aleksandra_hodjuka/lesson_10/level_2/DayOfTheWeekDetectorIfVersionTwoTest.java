package students.aleksandra_hodjuka.lesson_10.level_2;

class DayOfTheWeekDetectorIfVersionTwoTest {
    public
    static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTwo detector = new DayOfTheWeekDetectorIfVersionTwo();

        // Тестирование корректных значений
        testValidInput(detector, 1, "Monday");
        testValidInput(detector, 2, "Tuesday");
        testValidInput(detector, 3, "Wednesday");
        testValidInput(detector, 4, "Thursday");
        testValidInput(detector, 5, "Friday");
        testValidInput(detector, 6, "Saturday");
        testValidInput(detector, 7, "Sunday");

        // Тестирование некорректных значений
        testInvalidInput(detector, 0, "Please, enter a valid number between 1 and 7");
        testInvalidInput(detector, 8, "Please, enter a valid number between 1 and 7");
    }

    public static void testValidInput(DayOfTheWeekDetectorIfVersionTwo detector, int number, String expected) {
        String result = detector.detectDayName(number);
        if (result.equals(expected)) {
            System.out.println("Test passed  " + number);
        } else {
            System.out.println("Test failed  " + number + ". Expected: " + expected + ", but got: " + result);
        }
    }

    public static void testInvalidInput(DayOfTheWeekDetectorIfVersionTwo detector, int number, String expected) {
        String result = detector.detectDayName(number);
        if (result.equals(expected)) {
            System.out.println("Test passed  " + number);
        } else {
            System.out.println("Test failed  " + number + ". Expected: " + expected + ", but got: " + result);
        }
    }

}
