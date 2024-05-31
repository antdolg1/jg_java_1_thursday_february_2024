package students.ruslan_k.lesson_10.level_2;

public class DayOfTheWeekDetectorsTest {
    public static void main(String[] args) {
        int correctNumber = 4;
        String expectDay = "Thursday";
        int incorrectNumber = 8;
        String expectMessage="Please input a valid number between 1 and 7";

        DayOfTheWeekDetectorIfVersion dowIf = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorSwitchVersion dowSwitch = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorArrayVersion dowArray = new DayOfTheWeekDetectorArrayVersion();
        System.out.println("Test Day of the week detector based on IF method with correct number of weekday was " +
                ((dowIf.detectDayName(correctNumber).equals(expectDay)) ? "passed" : "failed"));
        System.out.println("Test Day of the week detector based on SWITCH method with correct number of weekday was " +
                ((dowSwitch.detectDayName(correctNumber).equals(expectDay)) ? "passed" : "failed"));
        System.out.println("Test Day of the week detector based on ARRAY method with correct number of weekday was " +
                ((dowArray.detectDayName(correctNumber).equals(expectDay)) ? "passed" : "failed"));
        System.out.println();
        System.out.println("Test Day of the week detector based on IF method with incorrect number of weekday was " +
                ((dowIf.detectDayName(incorrectNumber).equals(expectMessage)) ? "passed" : "failed"));
        System.out.println("Test Day of the week detector based on SWITCH method with incorrect number of weekday was " +
                ((dowSwitch.detectDayName(incorrectNumber).equals(expectMessage)) ? "passed" : "failed"));
        System.out.println("Test Day of the week detector based on ARRAY method with incorrect number of weekday was " +
                ((dowArray.detectDayName(incorrectNumber).equals(expectMessage)) ? "passed" : "failed"));

    }
}
