package teacher.lesson_16.lessoncode;

public class MyThread extends Thread {
    @Override
    public void run() {
        //код, который будет выполняться в новом потоке
    }
}


//MyThread thread = new MyThread();
//thread.start();

//поток, используя лямбда-выражения
//Thread thread = new Thread(() -> {
//    //код, который будет выполняться в новом потоке
//});
//thread.start();

//start() - запускает новый поток
//run() - метод, который выполняет код потока
//join() - ждёт завершения потока
//sleep(long millis) - приостанавлиет выполнение потока на заданное кол-вл миллисекунд
//getName() & setName() - возвращает и задаёт имя для потока
//isAlive() - проверяет, работает ли поток в данный момент
//setPriority(int newPriority) & getPriority() - задаём и получаем приоритет. По умолчанию, приоритет равен 5. 1 - минимальный приоритет, 10 - максимальный.

//name - имя потока
//priority - приоритет потока
//threadStatus - внутренний статус потока
//group - группа потоков, к которому принаджелит поток
