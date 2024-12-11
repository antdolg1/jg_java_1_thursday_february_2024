package students.arturs_novikovs.lesson_10.level_2;

public class DayOfTheWeekDetectorSwitchVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
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
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }
    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }
    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }
    public void shouldReturnThursday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }
    public void shouldReturnFriday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void shouldReturnNotCorrect() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(10);
        checkTestResult("Not correct day number 10 ".equals(dayOfTheWeek), "Not correct day number 10 ");
    }
    public void shouldReturnNotCorrectOne() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = detector.detectDayName(15);
        checkTestResult("Not correct day number 15 ".equals(dayOfTheWeek), "Not correct day number 15 ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
