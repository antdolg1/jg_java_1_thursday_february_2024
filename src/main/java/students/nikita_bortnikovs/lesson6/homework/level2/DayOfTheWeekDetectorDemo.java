package students.nikita_bortnikovs.lesson6.homework.level2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector dayDetector = new DayOfTheWeekDetector();

        int dayNumber = dayDetector.getDayNumberFromUser();

        String dayOfTheWeek = dayDetector.findDayOfTheWeek(dayNumber);

        System.out.println("Day of the week: " + dayOfTheWeek);

    }

    }

