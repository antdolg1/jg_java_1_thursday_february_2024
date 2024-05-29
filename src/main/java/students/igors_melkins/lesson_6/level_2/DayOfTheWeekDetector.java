package students.igors_melkins.lesson_6.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getDayNumberFromUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put  day number between 1 to 7 ");
        return scanner.nextInt();
    }
    public String findDayOfTheWeek(int dayNumber){
        String dayOfTheWeek ;

        switch (dayNumber){
            case 1:
                dayOfTheWeek = "Monday";
                break;

            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                dayOfTheWeek = "Invalid day number";
        }
        return dayOfTheWeek;
    }
    public void shouldReturnMonday() {
    }
    public void shouldReturnTuesday() {
    }
    public void shouldReturnWednesday() {
    }
    public void shouldReturnThursday() {
    }
    public void shouldReturnFriday() {
    }
    public void shouldReturnSaturday() {
    }
    public void shouldReturnSunday() {
    }
}

