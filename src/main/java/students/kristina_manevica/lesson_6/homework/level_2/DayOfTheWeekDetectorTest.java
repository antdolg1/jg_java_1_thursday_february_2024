package students.kristina_manevica.lesson_6.homework.level_2;

public class DayOfTheWeekDetectorTest {

    DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.dayOfTheWeekTest();
    }

    public void dayOfTheWeekTest() {

        String actualResultOne = dayOfTheWeekDetector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(actualResultOne), "Monday");

        String actualResultTwo = dayOfTheWeekDetector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(actualResultTwo), "Tuesday");

        String actualResultThree = dayOfTheWeekDetector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(actualResultThree), "Wednesday");

        String actualResultFour = dayOfTheWeekDetector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(actualResultFour), "Thursday");

        String actualResultFive = dayOfTheWeekDetector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(actualResultFive), "Friday");

        String actualResultSix = dayOfTheWeekDetector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(actualResultSix), "Saturday");

        String actualResultSeven = dayOfTheWeekDetector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(actualResultSeven), "Sunday");

        String actualResultNegative = dayOfTheWeekDetector.findDayOfTheWeek(8);
        checkTestResult("Not correct day number".equals(actualResultNegative), "Negative test");
    }

    private void checkTestResult(boolean condition, String testName){
        System.out.println((condition) ? testName + " OK!" : testName + " Fail!");
    }
}
