package com.tipsandtricks.main;

import com.tipsandtricks.Caller;

import java.util.concurrent.*;

public class ExecutorFutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Code to be executed while something asynchronously.
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return "completed";
        });

        try { // Check the task
            while(!future.isDone()) {
                System.out.println("Task is still in progress...wait.");
                Thread.sleep(500);
            }
            System.out.println("Task completed.");
            String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);

            executorService.shutdown();
        } catch (ExecutionException | InterruptedException |TimeoutException e) {
            future.cancel((true));
            future.isDone();
            future.isCancelled();
            e.printStackTrace();
        }

        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorServiceInvoke() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("Executor service example.");
        });
    }

    private static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("Executor example.");
        });
    }
}
