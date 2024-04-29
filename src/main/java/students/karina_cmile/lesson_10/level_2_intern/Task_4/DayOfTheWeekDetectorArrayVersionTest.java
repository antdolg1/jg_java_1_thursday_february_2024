package students.karina_cmile.lesson_10.level_2_intern.Task_4;

public class DayOfTheWeekDetectorArrayVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorArrayVersionTest test = new DayOfTheWeekDetectorArrayVersionTest();
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
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }
    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }
    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }
    public void shouldReturnThursday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }
    public void shouldReturnFriday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void shouldReturnNotCorrect() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(12);
        checkTestResult("Not correct day number 12 ".equals(dayOfTheWeek), "Not correct day number 12 ");
    }
    public void shouldReturnNotCorrectOne() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = detector.detectDayName(9);
        checkTestResult("Not correct day number 9 ".equals(dayOfTheWeek), "Not correct day number 9 ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
