package students.kristina_manevica.lesson_10.homework.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int number from 1 to 7:");
        return scanner.nextInt();
    }

    public void run() {
        String dayName = detector.detectDayName(getNumberFromUser());
        System.out.println("Result: " + dayName);
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorIfVersion detectorIf = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(detectorIf);
        System.out.println("If version:");
        ifVersion.run();
        System.out.println("");

        DayOfTheWeekDetectorSwitchVersion detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo switchVersion = new DayOfTheWeekDetectorDemo(detectorSwitch);
        System.out.println("Switch version:");
        switchVersion.run();
        System.out.println("");

        DayOfTheWeekDetectorArrayVersion detectorArray = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo arrayVersion = new DayOfTheWeekDetectorDemo(detectorArray);
        System.out.println("Array version:");
        arrayVersion.run();
    }
}