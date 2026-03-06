package Multithreading.Locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private Lock lock = new ReentrantLock(true);

    public void withDraw(int amount)  {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw: " + amount + " inr");

        try {
            if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " is processing with payment...");
                        Thread.sleep(1000);
                         balance -= amount;
                        System.out.println(Thread.currentThread().getName()+" Payment of "+amount+ " is processed, Remaining balance "+balance);

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance!");
                }
            } else {
                System.out.println(Thread.currentThread().getName()+" Could not acquire the lock. please try again later.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}