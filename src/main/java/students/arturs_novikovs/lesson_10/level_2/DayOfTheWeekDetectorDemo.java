package students.arturs_novikovs.lesson_10.level_2;

import java.util.Scanner;
public class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector thisDay;
    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector thisDay) {
        this.thisDay = thisDay;
    }
    public void run () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        String day = thisDay.detectDayName(number);
        System.out.println("The " + number + "th day of the week calls " + day);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo arrayVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        arrayVersion.run();
        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorVersionIf());
        ifVersion.run();
        DayOfTheWeekDetectorDemo switchVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        switchVersion.run();
    }
}