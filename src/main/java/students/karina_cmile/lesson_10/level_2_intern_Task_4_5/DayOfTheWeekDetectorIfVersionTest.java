package students.karina_cmile.lesson_10.level_2_intern_Task_4_5;

public class DayOfTheWeekDetectorIfVersionTest {


    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTest test = new DayOfTheWeekDetectorIfVersionTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnNotCorrect();
        test.shouldReturnNotCorrectOne();
    }
    public void shouldReturnMonday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }
    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }
    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }
    public void shouldReturnThursday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }
    public void shouldReturnFriday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void shouldReturnNotCorrect() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(0);
        checkTestResult("Not correct day number 0 ".equals(dayOfTheWeek), "Not correct day number 0 ");
    }
    public void shouldReturnNotCorrectOne() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = detector.detectDayName(8);
        checkTestResult("Not correct day number 8 ".equals(dayOfTheWeek), "Not correct day number 8 ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}





