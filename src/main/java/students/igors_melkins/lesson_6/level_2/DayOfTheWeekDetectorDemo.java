package students.igors_melkins.lesson_6.level_2;

import students.slava_subacius.lesson_6.level_2.DayOfTheWeekDetector;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println("The day of the week is " + dayOfTheWeek);
    }
}
