package Multithreading.Locking.ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock(true);
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try{
            count++;
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try{
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i =0; i < 6; i++){
                    System.out.println(Thread.currentThread().getName()+": Read: "+ counter.getCount());

                }
            }
        };
        
        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i =0; i < 6; i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+": Incremented.");
                }

            }
        };

        Thread WriteThread1 = new Thread(writeTask,"WriteThread");
        Thread WriteThread2 = new Thread(writeTask,"WriteThread");
        Thread ReadThread1 = new Thread(readTask,"ReadThread");
        Thread ReadThread2 = new Thread(readTask, "ReadThread");

        WriteThread1.start();
        WriteThread2.start();
        ReadThread1.start();
        ReadThread2.start();

        WriteThread1.join();
        WriteThread2.join();
        ReadThread1.join();
        ReadThread1.join();

    }
}
