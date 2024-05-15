package students.aleksandra_hodjuka.level_4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        WhileLoopContinue loopContinue = new WhileLoopContinue();
        loopContinue.runLoop();
    }

    public void runLoop() {
        int count = 0;
        while (count < 10) {
            count++;

            // Проверяем, является ли число четным
            if (count % 2 == 0) {
                // Если число четное, пропускаем текущую итерацию цикла
                continue;
            }

            System.out.println("Текущее число: " + count);
        }
    }
}
