package teacher.lesson_16.lessoncode;

public class RunnerThread extends Thread{
    private boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Thread running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public void shutDown() {
        this.isRunning = false;
    }
}
