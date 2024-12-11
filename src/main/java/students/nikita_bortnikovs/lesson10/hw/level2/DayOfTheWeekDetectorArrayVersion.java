package students.nikita_bortnikovs.lesson10.hw.level2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    public static  String[] daysOfTheWeek = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };
    @Override
    public String detectDayName(int number) {
        if (number >= 0 && number <= 6) {
            return daysOfTheWeek[number];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        int number = 2;
        String dayName = detector.detectDayName(number-1);
        System.out.println("Day of the week is " + dayName);

    }
}

