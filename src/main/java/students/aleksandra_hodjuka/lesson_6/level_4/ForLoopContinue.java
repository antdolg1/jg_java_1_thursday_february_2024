package students.aleksandra_hodjuka.lesson_6.level_4;

public class ForLoopContinue {
    public static void main(String[] args) {
        ForLoopContinue loopContinue = new ForLoopContinue();
        loopContinue.runLoop();
    }

    public void runLoop() {
        for (int i = 0; i < 10; i++) {
            // Проверяем, является ли текущее число i четным
            if (i % 2 == 0) {
                // Если число четное, пропускаем текущую итерацию цикла
                continue;
            }

            System.out.println("Текущее число: " + i);
        }
    }
}
