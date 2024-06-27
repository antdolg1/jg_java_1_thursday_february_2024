package teacher.lesson_16.lessoncode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadedSumCalculator {

    private static final Logger logger = Logger.getLogger(MultiThreadedSumCalculator.class.getName());

    public static void main(String[] args) {

        long inputNumber = 100000000L;
        int threadsAmount = 10;

        long startTime2 = System.currentTimeMillis();
        long sum2 = calculateSumWithThreads(inputNumber, threadsAmount);
        long endTime2 = System.currentTimeMillis();

        long startTime = System.currentTimeMillis();
        long sum = calculateSum(inputNumber);
        long endTime = System.currentTimeMillis();


        System.out.println("Multi-threaded sum calculation result: " + sum2);
        System.out.println("Time taken: " + (endTime2 - startTime2) + " ms");
        System.out.println("______________________");
        System.out.println("Single-threaded sum calculation result: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

    }

    private static long calculateSumWithThreads(long inputNumber, int threadsAmount) {
        long sum = 0;
        SumThread[] threads = new SumThread[threadsAmount];
        long numbersPerThread = inputNumber / threadsAmount;

        for (int i = 0; i < threadsAmount; i++) {
            long startNumber = i * numbersPerThread + 1;
            long endNumber = (i + 1) * numbersPerThread;
            threads[i] = new SumThread(startNumber, endNumber);
            threads[i].start();
        }

        try {
            for (SumThread thread : threads) {
                thread.join();
                sum += thread.getPartialSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum;
    }

    private static long calculateSum(long inputNumber) {
        logger.log(Level.INFO, "Entered calculateSum() method");
        long sum = 0;
        for (int i = 1; i <= inputNumber; i++) {
            sum += i;
        }
        return  sum;
    }
}

class SumThread extends Thread {
    private long startNumber;
    private long endNumber;
    private long partialSum;

    public SumThread(long startNumber, long endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public long getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        partialSum = 0;
        for (long i = startNumber; i <= endNumber; i++) {
            partialSum += i;
        }
    }
}
