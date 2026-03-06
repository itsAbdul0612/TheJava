package Multithreading.Volatile_Vs_Atomic;


import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {

    private AtomicInteger counter = new AtomicInteger();

    public  void increment(){
        counter.incrementAndGet();
    }

    public int getCounter()

    {
        return counter.get();
    }

    public static void main(String[] args) {
VolatileCounter vc = new VolatileCounter();
        Thread t1 = new Thread(()-> {
           for (int i = 0; i < 1000; i++){
               vc.increment();
           }
        });

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 1000; i++){
                vc.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(vc.getCounter());

    }
}
