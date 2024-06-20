package students.arturs_novikovs.lesson_16.level_1;

public class FiveThreadsAndNumber {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        for (int i = 0; i < numberOfThreads; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                printHelloWorld(threadNumber);
            });

            // Запускаем поток
            thread.start();
        }
    }

    private static void printHelloWorld(int threadNumber) {
        System.out.println(threadNumber + "   Hello World");
    }
    }