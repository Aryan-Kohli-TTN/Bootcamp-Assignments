package Assignment;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer>futureVal = executorService.submit(()->{
            return (int)(Math.random()*100);
        });
        executorService.shutdown();
        System.out.println(futureVal.get());

    }
}
