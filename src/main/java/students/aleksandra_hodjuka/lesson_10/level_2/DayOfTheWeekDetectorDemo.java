package students.aleksandra_hodjuka.lesson_10.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();

        String dayName = detector.detectDayName(number);
        System.out.println("Day of the week: " + dayName);
    }

    public static void main(String[] args) {
        // Создаем экземпляры различных реализаций DayOfTheWeekDetector
        DayOfTheWeekDetectorIfVersion detectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorIfVersionTwo detectorIfVersionTwo = new DayOfTheWeekDetectorIfVersionTwo();


        // Демонстрируем использование каждой реализации в программе


        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(detectorIfVersionTwo);
        System.out.println("Using array version:");
        demo1.run();

        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(detectorIfVersion);
        System.out.println("Using switch version:");
        demo2.run();
    }
}
