package students.kristina_manevica.lesson_6.homework.level_2;


public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        int dayNumber = dayOfTheWeekDetector.getDayNumberFromUser();

        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        System.out.println("Day: " + dayOfTheWeek);
    }
}
