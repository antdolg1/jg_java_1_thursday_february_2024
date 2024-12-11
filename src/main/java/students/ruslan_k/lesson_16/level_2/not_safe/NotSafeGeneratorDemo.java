package students.ruslan_k.lesson_16.level_2.not_safe;

public class NotSafeGeneratorDemo {

    private static void idChange() {
        for (int i = 0; i < 10000; i++) {

            NotThreadSafeIdGenerator.nextId();
        }

    }

    public static void main(String[] args) {


        Thread thread1 = new Thread(NotSafeGeneratorDemo::idChange);

        Thread thread2 = new Thread(NotSafeGeneratorDemo::idChange);

        Thread thread3 = new Thread(NotSafeGeneratorDemo::idChange);


        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted ");
            e.printStackTrace();
        }


        System.out.println("Expect 30000 unique id, actual we have " + NotThreadSafeIdGenerator.getId());


    }


}
