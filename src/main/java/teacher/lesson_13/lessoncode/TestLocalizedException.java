package teacher.lesson_13.lessoncode;

import java.util.Locale;

public class TestLocalizedException {
    public static void main(String[] args) {

        try {
            throw new LocalizedException(new Locale("ru", "RU"));
        } catch (LocalizedException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
