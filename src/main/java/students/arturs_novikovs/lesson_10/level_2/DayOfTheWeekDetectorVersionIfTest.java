package students.arturs_novikovs.lesson_10.level_2;

public class DayOfTheWeekDetectorVersionIfTest {


    public static void main(String[] args) {
        DayOfTheWeekDetectorVersionIfTest test = new DayOfTheWeekDetectorVersionIfTest();
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
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }
    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }
    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }
    public void shouldReturnThursday() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }
    public void shouldReturnFriday() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void shouldReturnNotCorrect() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
        String dayOfTheWeek = detector.detectDayName(0);
        checkTestResult("Not correct day number 0 ".equals(dayOfTheWeek), "Not correct day number 0 ");
    }
    public void shouldReturnNotCorrectOne() {
        DayOfTheWeekDetectorVersionIf detector = new DayOfTheWeekDetectorVersionIf();
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
