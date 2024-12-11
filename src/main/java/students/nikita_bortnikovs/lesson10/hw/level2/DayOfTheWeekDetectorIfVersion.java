package students.nikita_bortnikovs.lesson10.hw.level2;

public class  DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }

    }

    public static void main(String[] args) {
DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
int  number = 1;
String dayName = detector.detectDayName(number);
System.out.println("Day of the week is  " + dayName);
    }

}
