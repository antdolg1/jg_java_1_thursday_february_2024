package students.arturs_novikovs.lesson_16.level_1;

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
}
}
