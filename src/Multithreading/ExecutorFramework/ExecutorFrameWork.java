package Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameWork {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executors = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            Future<?> future = executors.submit(
                    () -> {
                        long result = factorial(finalI);
                        System.out.println(result);
                    });
        }
        executors.shutdown();
        try {
            executors.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }

    public static long factorial(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            try {
                Thread.sleep(1000
                );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            result *= i; //sleep, 1*1 =1, sleep, 1*2, sleep, 2*3, sleep, 4*6, sleep,
        }
        return result;
    }
}

//factorial(5) = 1*2*3*4*5;