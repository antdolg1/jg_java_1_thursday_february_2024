package students.ruslan_k.lesson_10.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeek dayOfWeek;

    DayOfTheWeekDetectorDemo(DayOfTheWeek dotw) {
        this.dayOfWeek = dotw;

    }

    void run() {
        int numberOfDay;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input day of the week (int between 1-7): ");
        numberOfDay = scan.nextInt();
        String day = dayOfWeek.detectDayName(numberOfDay);
        System.out.println("Day of the week is " + day);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ddSwitchWer = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        ddSwitchWer.run();
        DayOfTheWeekDetectorDemo ddIfVer = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ddIfVer.run();
        DayOfTheWeekDetectorDemo ddArrayVer = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        ddArrayVer.run();
    }

}
