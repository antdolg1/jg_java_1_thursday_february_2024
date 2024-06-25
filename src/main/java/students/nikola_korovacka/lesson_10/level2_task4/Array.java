package students.nikola_korovacka.lesson_10.level2_task4;

public class Array implements DayOfTheWeekDetector {

    private static final String[] DAYS = {
            "Please input a valid number between 1 and 7", // indeks 0
            "Monday",   // indeks 1
            "Tuesday",  // indeks 2
            "Wednesday",// indeks 3
            "Thursday", // indeks 4
            "Friday",   // indeks 5
            "Saturday", // indeks 6
            "Sunday"    // indeks 7
    };

    @Override
    public String detectDayName(int number) {
        if (number < 1 || number > 7) {
            return DAYS[0];
        }
        return DAYS[number];
    }
}
