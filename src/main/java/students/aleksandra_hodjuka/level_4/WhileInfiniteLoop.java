package students.aleksandra_hodjuka.level_4;

public class WhileInfiniteLoop {
    public static void main(String[] args) {
        WhileInfiniteLoop infiniteLoop = new WhileInfiniteLoop();
        infiniteLoop.runInfiniteLoop();
    }

    private void runInfiniteLoop() {
        while (true) {
            System.out.println("Бесконечный цикл");
        }
    }
}
