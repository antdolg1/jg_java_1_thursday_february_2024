package students.ruslan_k.lesson_16;

public class FiveThreadsDemo {
    public static void main(String[] args) {

        MyThread[] myThreads = new MyThread[5];

        for (int i = 0; i < 5; i++){
            myThreads[i]= new MyThread();
            myThreads[i].start();
        }

    }
}
