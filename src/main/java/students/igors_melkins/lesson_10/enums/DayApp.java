package students.igors_melkins.lesson_10.enums;

import teacher.lesson_10.lessoncode.array_problem.SortSelect;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class DayApp {
    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        String todayAsString = todayDate.getDayOfWeek().toString();
        System.out.println(todayAsString);

        DayEnum today = DayEnum.MONDAY;
        String todayEnumAsString = today.name();
        System.out.println(todayEnumAsString);

        if (todayAsString.equals(todayEnumAsString)){
            System.out.println("Yes,today is Monday");
        }

        if(today == DayEnum.MONDAY){
            System.out.println("Today is Monday ");
            System.out.println("Today is " + todayEnumAsString);
            System.out.println("Сегодня " + today.getNameRus());
            System.out.println(today.getNameRus()+ "является " + today.getOrder()+ "днем недели");
        }

        System.out.println();

        for (DayEnum day : DayEnum.values()){
            System.out.println(day);
        }

    }
}
