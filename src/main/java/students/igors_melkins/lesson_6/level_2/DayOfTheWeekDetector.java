package students.igors_melkins.lesson_6.level_2;


import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();

    }

    public String findDayOfTheWeek(int dayNumber){
        String dayOfTheWeek;
        switch (dayNumber){
            case 1:
                dayOfTheWeek = "Monday";
            case 2:
                dayOfTheWeek = "Tuesday";
            case 3:
                dayOfTheWeek = "Wednesday";
            case 4:
                dayOfTheWeek = "Thursday";
            case 5:
                dayOfTheWeek = "Friday";
            case 6:
                dayOfTheWeek = "Saturday";
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                dayOfTheWeek = "Invalid day number";




        }
        return dayOfTheWeek;
    }
}
