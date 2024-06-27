package students.kristina_manevica.lesson_10.homework.level_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    String[] array = {"Please input a valid number between 1 and 7", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return array[number];
        }
        return array[0];
    }
}