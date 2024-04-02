package students.ruslan_k.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        String testValue;
        boolean condition;
        String[] expectValues = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", null};
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        for (int i = 1; i <= 8; i++) {
            testValue = DayOfTheWeekDetector.getDayName(i);
            condition = test.compareResult(testValue, expectValues[i - 1]);
            test.printResult(condition, expectValues[i - 1]);
        }

    }

    boolean compareResult(String testValue, String expectValue) {
        if (expectValue == null) {
            return testValue == null;
        } else {
            return testValue.equals(expectValue);
        }

    }

    void printResult(boolean condition, String expectValue) {
        if (condition) {
            System.out.println("Test " + expectValue + ": - Ok");
        } else {
            System.out.println("Test " + expectValue + ": - Failed");
        }
    }
}