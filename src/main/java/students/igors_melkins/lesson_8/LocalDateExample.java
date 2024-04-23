package students.igors_melkins.lesson_8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024,03,21); //March 21,2024

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        System.out.printf("Year:%d,month:%d,day:%d ",year,month,day);

        String monthString = currentDate.getMonth().name();
        System.out.println();
        System.out.println(monthString);

        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate lastMonth = currentDate.minusMonths(1);
        LocalDate nextYear = currentDate.plusYears(1);

        System.out.println("Tomorrow:" + tomorrow + "/ previous month:" + lastMonth + "/ next year : " + nextYear);

        if (currentDate.isBefore(nextYear)){
            System.out.println("Date is before future date");
        } else  if (currentDate.isAfter(nextYear)){
            System.out.println("Date is after the future date");
        } else {
            System.out.println("Date is the same as future date ");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MM - yyyy");
        String formatterDate = currentDate.format(formatter);
        System.out.println("Formatted current date :" + formatterDate);

        int year2025 = 2025;
        boolean isLeapYear = LocalDate.ofYearDay(year2025,1).isLeapYear();
        System.out.println(year2025 + " is leap year: " + isLeapYear);

        boolean isWeekend = currentDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) || currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        System.out.println("Is it weekend yet ?" + isWeekend);

        LocalDate startDate = LocalDate.of(2024,1,1);
        LocalDate endDate = LocalDate.of(2024,12,31);
        long dayIs2024 = ChronoUnit.DAYS.between(startDate,endDate)+1 ;
        System.out.println("Days in 2024: " + dayIs2024);

        LocalDateTime currentDataTime = LocalDateTime.now();
        System.out.println(currentDataTime);

    }
}
