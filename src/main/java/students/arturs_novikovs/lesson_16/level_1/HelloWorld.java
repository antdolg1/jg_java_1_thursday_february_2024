package students.arturs_novikovs.lesson_16.level_1;

public class HelloWorld {public static void main(String[] args) {
    Thread thread = new Thread(HelloWorld::printHelloWorld);
    thread.start();
    try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

    private static void printHelloWorld() {
        System.out.println("Hello World");
    }
}
