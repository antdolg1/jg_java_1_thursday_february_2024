package students.ruslan_k.lesson_16;

public class MyThread extends Thread {
    @Override
    public void run() {

        System.out.println("[" + getName() + "] " + "Hello world");
    }
}
