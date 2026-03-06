package Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteableF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(
                () ->
                {
                    try {
                        Thread.sleep(5000);
                        System.out.println("Worker");
                    } catch (InterruptedException e) {

                    }
                    return "Ok";
                });

        String s = completableFuture.getNow("Nooo");
        System.out.println(s);

        System.out.println("Main");
    }
}
