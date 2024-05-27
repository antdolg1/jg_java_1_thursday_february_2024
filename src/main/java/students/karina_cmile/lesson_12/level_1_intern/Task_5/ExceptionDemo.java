package students.karina_cmile.lesson_12.level_1_intern.Task_5;


public class ExceptionDemo extends Exception {
    //Не инициализируется и впоследствии может быть инициализирован при вызове initCause.
    public ExceptionDemo() {super();
    }
    //Причина не инициализируется и впоследствии может быть инициализирована при вызове initCause. Параметры:
    //Сообщение. Сообщение сохраняется для последующего поиска методом getMessage ().
    public ExceptionDemo(String message) {
        super(message);
    }
    //Новое исключение с указанным сообщением и причиной.
    public ExceptionDemo(String message, Throwable cause) {
        super(message, cause);
    }
    //Новое исключение с указанной причиной и подробным сообщением (причина == null? null: canes.tostring ()) (которое обычно содержит класс и подробное сообщение причины).
    public ExceptionDemo(Throwable cause) {
        super(cause);
    }

    //Новое исключение с указанным подробным сообщением, причиной, включенным или отключенным подавлением, а также stack trace.
    protected ExceptionDemo(String message, Throwable cause,
                            boolean enableSuppression,
                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
