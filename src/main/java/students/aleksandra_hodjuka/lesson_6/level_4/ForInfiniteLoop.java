package students.aleksandra_hodjuka.lesson_6.level_4;

public class ForInfiniteLoop {
    public static void main(String[] args) {
        ForInfiniteLoop infiniteLoop = new ForInfiniteLoop();
        infiniteLoop.runInfiniteLoop();
    }

    public void runInfiniteLoop() {
        for (int i = 0; true; i++) {
            System.out.println("Бесконечный цикл");
        }
    }

}
