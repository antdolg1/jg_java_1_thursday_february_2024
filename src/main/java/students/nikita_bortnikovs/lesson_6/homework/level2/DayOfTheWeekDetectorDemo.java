package students.nikita_bortnikovs.lesson_6.homework.level2;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector dayDetector = new DayOfTheWeekDetector();

        int dayNumber = dayDetector.getDayNumberFromUser();

        String dayOfTheWeek = dayDetector.findDayOfTheWeek(dayNumber);

        System.out.println("Day of the week: " + dayOfTheWeek);

    }

    }

