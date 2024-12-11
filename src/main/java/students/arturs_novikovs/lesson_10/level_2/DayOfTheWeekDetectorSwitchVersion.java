package students.arturs_novikovs.lesson_10.level_2;

public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector{
    String dayString;
    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        return dayString;
    }
}
