package students.aleksandra_hodjuka.lesson_6.level_4;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        WhileInfiniteLoopBreak infiniteLoopBreak = new WhileInfiniteLoopBreak();
        infiniteLoopBreak.runInfiniteLoop();
    }

    public void runInfiniteLoop() {
        int count = 0;
        while (true) {
            System.out.println("Бесконечный цикл, итерация: " + count);
            count++;

            // Проверка условия для выхода из цикла
            if (count >= 10) {
                System.out.println("Достигнут предел итераций. Выходим из цикла.");
                break; // Выход из цикла
            }
        }
    }
}
