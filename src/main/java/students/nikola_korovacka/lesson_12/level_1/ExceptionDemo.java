package students.nikola_korovacka.lesson_12.level_1;


public class ExceptionDemo {

    public static void main(String[] args) {
        try {
                //Создание исключения с сообщением об ошибке
                throw new Exception("Это сообщение об ошибке");

            } catch (Exception e) {
                System.out.println("Перехвачено исключение: " + e.getMessage());
            }
            try {
                // Создание исключения без сообщения
                throw new Exception();

            } catch (Exception e) {
                System.out.println("Перехвачено исключение без сообщения");
            }

            try {
                //Создание исключения с указанием причины
                throw new Exception("Исключение с причиной", new RuntimeException("Причина исключения"));

            } catch (Exception e) {
                System.out.println("Перехвачено исключение с причиной: " + e.getCause().getMessage());
            }
    }
}


