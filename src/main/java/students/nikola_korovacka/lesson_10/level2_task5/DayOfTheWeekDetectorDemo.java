package students.nikola_korovacka.lesson_10.level2_task5;

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
        DayOfTheWeekDetector ifVersion = new IfVersion();
        DayOfTheWeekDetector switchVersion = new Switch();
        DayOfTheWeekDetector arrayVersion = new Array();

        System.out.println("Using IfVersion:");
        DayOfTheWeekDetectorDemo demoIf = new DayOfTheWeekDetectorDemo(ifVersion);
        demoIf.run();

        System.out.println("Using SwitchVersion:");
        DayOfTheWeekDetectorDemo demoSwitch = new DayOfTheWeekDetectorDemo(switchVersion);
        demoSwitch.run();

        System.out.println("Using ArrayVersion:");
        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo(arrayVersion);
        demoArray.run();
    }
}
