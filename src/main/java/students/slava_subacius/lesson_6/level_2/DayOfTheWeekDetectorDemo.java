package students.slava_subacius.lesson_6.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println("The day of the week is: " + dayOfTheWeek);
    }

}
