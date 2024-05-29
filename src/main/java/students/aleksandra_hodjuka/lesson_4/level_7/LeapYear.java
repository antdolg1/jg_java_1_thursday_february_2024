package students.aleksandra_hodjuka.lesson_4.level_7;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false; // Год не делится на 4, значит он обычный.
        } else if (year % 100 != 0) {
            return true; // Год делится на 4, но не на 100, значит он високосный.
        } else {
            return year % 400 == 0; // Год делится на 100, проверяем делимость на 400.
        }
    }
}
