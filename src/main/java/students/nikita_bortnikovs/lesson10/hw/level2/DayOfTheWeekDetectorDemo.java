package students.nikita_bortnikovs.lesson10.hw.level2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number 1-7 ");
        int number = scanner.nextInt();
        String dayName = detector.detectDayName(number);
        System.out.println("Your day name is  " + dayName);
    }

    public static void main(String[] args) {

        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorIfVersion();

        DayOfTheWeekDetectorDemo demoSwitch = new DayOfTheWeekDetectorDemo(detectorSwitch);
        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo(detectorArray);
        DayOfTheWeekDetectorDemo demoIf = new DayOfTheWeekDetectorDemo(detectorIf);

        System.out.println("switch");
        demoSwitch.run();

        System.out.println("array");
        demoArray.run();

        System.out.println("if");
        demoIf.run();
    }
}