package students.aleksandra_hodjuka.lesson_16.level_1;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем новый поток
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });

        // Запускаем поток
        thread.start();

        // Ожидаем завершения потока
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}