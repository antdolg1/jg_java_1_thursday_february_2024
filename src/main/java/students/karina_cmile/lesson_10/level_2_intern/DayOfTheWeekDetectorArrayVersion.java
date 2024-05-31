package students.karina_cmile.lesson_10.level_2_intern;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    String[] week = {"0", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int i;

    @Override
    public String detectDayName(int number) {
        for (int i = 0; i <= week.length; i++) {
            if (number >= 1 && number <= 7) {
                return week[number];
            } else {
                return "Please enter the number from 1 to 7";
            }
        }
        return null;
    }
}

