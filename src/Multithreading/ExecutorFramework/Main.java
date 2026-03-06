package Multithreading.ExecutorFramework;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executor = Executors.newFixedThreadPool(1);

//        Callable callable = () -> 42;
//        System.out.println(callable.call());
//        Future<Integer> future = executor.submit(callable);

//        Future<String> future = executor.submit(() -> System.out.println("Heavy task"), "Done");
//        System.out.println(future.get());
//        System.out.println(future.isDone());

//          Future<Integer> submit = executor.submit(()-> 1+2);
//          Integer i = submit.get();
//          System.out.println(i);
//
//          executor.shutdown();
//          Thread.sleep(1);
//          System.out.println(executor.isTerminated());

//        Callable<Integer> callable1 = () -> {
//            Thread.sleep(1000);
//            System.out.println("Task 1");
//            return 1;
//        };
//        Callable<Integer> callable2 = () -> {
//            System.out.println("Task 2");
//            return 2;
//        };
//        Callable<Integer> callable3 = () -> {
//            System.out.println("Task 3");
//            return 3;
//        };
//
//        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
//        List<Future<Integer>> future = executor.invokeAll(list, 10, TimeUnit.SECONDS);
//
//        for (Future<Integer> f: future){
//            System.out.println(f.get());
//        }
//
//        executor.shutdown();

//        Future<Integer> future = executor.submit(()-> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//
//                System.out.println("Exception occured: "+ e);
//            }
//            return 42;
//        });
//Thread.sleep(1000);
//        future.cancel(true);
//        System.out.println(future.isCancelled());
//        System.out.println(future.isDone());
//        executor.shutdown();
//


        // Scheduled Executor


//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.scheduleAtFixedRate(
//                () -> System.out.println("Task Executed After 5 Seconds."),
//                5,
//                5,
//                TimeUnit.SECONDS);
//        scheduler.schedule(
//                () -> {
//                    System.out.println("Initializing Shutdown...");
//                    scheduler.shutdown();
//                },
//                20, TimeUnit.SECONDS
//        );


        // Count Down Latch


        int noOfService = 3;
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CyclicBarrier barrier = new CyclicBarrier(noOfService);

        executor.submit(new dependentService(barrier));
        executor.submit(new dependentService(barrier));
        executor.submit(new dependentService(barrier));


        System.out.println("Main");
        executor.shutdown();

    }
}

class dependentService implements Callable<String> {
    private final CyclicBarrier barrier;

    public dependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + ": Service Started...");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+": is waiting at the barrier...");
        } finally {
           barrier.await();
        }
        return "Ok";
    }
}