package modern_java;

public class VirtualThreadsExample {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {

            int taskNumber = i;

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread: " + taskNumber
                );
            });
        }

        long endTime = System.currentTimeMillis();

        System.out.println(
                "\nExecution Time: "
                        + (endTime - startTime)
                        + " ms"
        );
    }
}