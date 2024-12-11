package students.nikita_bortnikovs.lesson_16.hw.level1;

public class FiveThreads {
    public static class HelloWorldThreads {
        public static void main(String[] args) {
           int numberOfThreads = 5;
            for (int i = 0; i < numberOfThreads; i++) {
                Thread thread = new Thread(HelloWorldThreads::printHelloWorld);
                thread.start();
            }
        }

        public static void printHelloWorld() {
            System.out.println("Hello World");
        }
    }}
