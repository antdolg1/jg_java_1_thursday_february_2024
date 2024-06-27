package teacher.lesson_10.lessoncode.enums;

import java.time.LocalDate;

public class DayApp {
    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        String todayAsString = todayDate.getDayOfWeek().toString();
        System.out.println(todayAsString);

        DayEnum today = DayEnum.THURSDAY;
        String todayEnumAsString = today.name();
        System.out.println(todayEnumAsString);

        if (todayAsString.equals(todayEnumAsString)) {
            System.out.println("Yes, today is Thursday");
        }

        if (today == DayEnum.THURSDAY) {
            System.out.println("Today is Thursday");
            System.out.println("Today is " + todayEnumAsString);
            System.out.println("Сегодня " + today.getNameRus());
            System.out.println(today.getNameRus() + " является " + today.getOrder() + " днём недели.");
        }

        System.out.println();
        for (DayEnum day : DayEnum.values()) {
            System.out.println(day);
        }
    }
}
