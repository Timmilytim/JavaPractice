package com.MultiThread;
import java.util.concurrent.*;

class CalculationTask implements Callable<Double> {
    private final double value;

    public CalculationTask(double value) {
        this.value = value;
    }

    public Double call() {
        return Math.sqrt(value);
    }
}

public class MultipleThreadResultsExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<Double> completionService = new ExecutorCompletionService<>(executor);

        double[] values = { 9.0, 16.0, 25.0};

        for (double value : values) {
            completionService.submit(new CalculationTask(value));
        }

        for (int i = 0; i < values.length; i++) {
            Future<Double> future = completionService.take();
            double result = future.get();
            System.out.println("Square root of " + values[i] + ": " + result);
        }

        executor.shutdown();
    }
}
