package students.aleksandra_hodjuka.lesson_12._level_1._task_5;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Использование конструктора без параметров
        try {
            simpleException();
        } catch (Exception e) {
            System.out.println("Exception caught without any message.");
        }

        // Использование конструктора с сообщением
        try {
            messageException();
        } catch (Exception e) {
            System.out.println("Exception caught with a message: " + e.getMessage());
        }

        // Использование конструктора с причиной
        try {
            causeException();
        } catch (Exception e) {
            System.out.println("Exception caught with a cause: " + e.getCause().getMessage());
        }
    }

    private static void simpleException() throws Exception {
        throw new Exception();
    }

    private static void messageException() throws Exception {
        throw new Exception("Detailed message of the exception");
    }

    private static void causeException() throws Exception {
        Exception cause = new Exception("The main cause of the exception");
        throw new Exception("Exception caused by another exception", cause);
    }
}
