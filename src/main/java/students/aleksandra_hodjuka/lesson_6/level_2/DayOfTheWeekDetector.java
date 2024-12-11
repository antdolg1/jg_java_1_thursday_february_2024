package students.aleksandra_hodjuka.lesson_6.level_2;

import java.util.Scanner;

 class DayOfTheWeekDetector {
    int dayNumber;
    String dayOfTheWeek;

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7: ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String dayOfWeek;
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day number";
        }
        return dayOfWeek;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println("Day of the week: " + dayOfWeek);
    }
        }



