package students.nikita_bortnikovs.lesson10.hw.level2;

public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        switch (number){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Please input a valid number between 1 and 7";
        }

    }
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        int  number = 1;
        String dayName = detector.detectDayName(number);
        System.out.println("Day of the week is  " + dayName);
    }
}