package students.kristina_manevica.lesson_10.homework.level_2;

public class DayOfTheWeekDetectorTest {

    private static final String[] expectedResults = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
            "Sunday"};
    private static final String expectedResultNegative = "Please input a valid number between 1 and 7";

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        test.testIfVersion();
        test.testSwitchVersion();
        test.testArrayVersion();
    }

    private static void testIfVersion() {
        DayOfTheWeekDetectorIfVersion detectorIfVersion = new DayOfTheWeekDetectorIfVersion();

        for (int i = 0; i < expectedResults.length; i++) {
            String actualResult = detectorIfVersion.detectDayName(i + 1);
            String expectedResult = expectedResults[i];
            System.out.println(expectedResult.equals(actualResult) ? "testIfVersion" + (i + 1) + " passed" :
                    "testIfVersion" + (i + 1) + " failed");
        }

        String actualResultNegative = detectorIfVersion.detectDayName(-1);
        System.out.println((expectedResultNegative.equals(actualResultNegative)) ? "testIfVersionNegative passed" :
                "testIfVersionNegative passed");
    }

    private static void testSwitchVersion() {
        DayOfTheWeekDetectorSwitchVersion detectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();

        for (int i = 0; i < expectedResults.length; i++) {
            String actualResult = detectorSwitchVersion.detectDayName(i + 1);
            String expectedResult = expectedResults[i];
            System.out.println(expectedResult.equals(actualResult) ? "testSwitchVersion" + (i + 1) + " passed" :
                    "testSwitchVersion" + (i + 1) + " failed");
        }

        String actualResultNegative = detectorSwitchVersion.detectDayName(0);
        System.out.println((expectedResultNegative.equals(actualResultNegative)) ? "testSwitchVersionNegative passed" :
                "testSwitchVersionNegative passed");
    }

    private static void testArrayVersion() {
        DayOfTheWeekDetectorArrayVersion detectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

        for (int i = 0; i < expectedResults.length; i++) {
            String actualResult = detectorArrayVersion.detectDayName(i + 1);
            String expectedResult = expectedResults[i];
            System.out.println(expectedResult.equals(actualResult) ? "testArrayVersion" + (i + 1) + " passed" :
                    "testArrayVersion" + (i + 1) + " failed");
        }

        String actualResultNegative = detectorArrayVersion.detectDayName(0000000000);
        System.out.println((expectedResultNegative.equals(actualResultNegative)) ? "testArrayVersionNegative passed" :
                "testArrayVersionNegative passed");
    }
}