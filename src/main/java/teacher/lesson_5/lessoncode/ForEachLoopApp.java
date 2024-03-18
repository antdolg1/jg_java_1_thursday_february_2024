package teacher.lesson_5.lessoncode;

public class ForEachLoopApp {
    public static void main(String[] args) {

        String[] daysOfWeek = {"Пон", "Вт", "Ср", "Чт", "Пт", "Сб", "Вск"};

        for (String dayOfWeek : daysOfWeek) {
            if (dayOfWeek.equals("Пон")) {
                dayOfWeek = "Mon";
            }
            System.out.println(dayOfWeek);
        }

    }
}
