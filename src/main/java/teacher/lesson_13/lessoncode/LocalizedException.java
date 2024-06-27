package teacher.lesson_13.lessoncode;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedException extends Exception{

    private Locale locale;

    public LocalizedException(Locale locale) {
        this.locale = locale;
    }

    @Override
    public String getLocalizedMessage() {
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        return messages.getString("error.message");
    }

}
