package students.aleksandra_hodjuka.lesson_10.level_2;

 class DayOfTheWeekDetectorIfVersionTwo implements DayOfTheWeekDetector {
    private String[] days = {
            "Please input a valid number between 1 and 7",
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return days[number];
        } else {
            return days[0];
        }
    }
}
