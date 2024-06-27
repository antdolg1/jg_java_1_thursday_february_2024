package teacher.lesson_16.lessoncode;

public class MyThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "/" + i);
        }
    }
}
