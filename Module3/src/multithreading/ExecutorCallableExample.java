package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableExample {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        List<Callable<Integer>> tasks =
                new ArrayList<>();

        // Creating Callable tasks
        for (int i = 1; i <= 5; i++) {

            int number = i;

            tasks.add(() -> {

                System.out.println(
                        "Processing Task: " + number
                );

                return number * number;
            });
        }

        try {

            List<Future<Integer>> results =
                    executor.invokeAll(tasks);

            System.out.println("\nTask Results:");

            for (Future<Integer> result : results) {

                System.out.println(
                        result.get()
                );
            }

        } catch (InterruptedException |
                 ExecutionException e) {

            System.out.println(
                    "Error occurred: " + e.getMessage()
            );

        } finally {

            executor.shutdown();
        }
    }
}