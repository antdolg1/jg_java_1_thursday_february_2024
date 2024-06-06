package students.arturs_novikovs.lesson_12.Level_1.Task_5;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception without message");
            e.printStackTrace();
        }

        try {
            throw new Exception("Message about error");
        } catch (Exception e) {
            System.out.println("Exception with message: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            throw new Exception("Message about error", new Throwable("Cause"));
        } catch (Exception e) {
            System.out.println("Exception with message and cause:");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            e.printStackTrace();
        }

        try {
            throw new Exception((new Throwable("Only cause")));
        } catch (Exception e) {
            System.out.println("Exception only with cause: ");
            System.out.println("Cause: " + e.getCause());
            e.printStackTrace();
        }

        try {
            throw new CustomException("Message, cause, suppression and trace write", new Throwable("Cause"), false, true);
        } catch (CustomException cE) {
            System.out.println("CustomException with additional parameters: ");
            System.out.println("Message: " + cE.getMessage());
            System.out.println("Cause: " + cE.getCause());
            cE.printStackTrace();
        }
    }

    static class CustomException extends Exception {
        protected CustomException(String message, Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
