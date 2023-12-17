package com.peyman.concurrent;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        // Using Future
        Future<String> futureResult = executor.submit(() -> {
            Thread.sleep(10000);
            return "Future result";
        });

        // Using CompletableFuture
        CompletableFuture<String> completableFutureResult = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "CompletableFuture result";
        });

        executor.shutdown();

        // Get result from CompletableFuture
        System.out.println("CompletableFuture result: " + completableFutureResult.thenAccept((str) -> System.out.println(str)));

        // Get result from Future
        System.out.println("Future result: " + futureResult.get());



        System.out.println("The End");

    }

}
