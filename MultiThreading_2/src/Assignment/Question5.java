package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> list1= new ArrayList<>();
        for(int i=0;i<50;i++){
            final int id = i+1;
            Future<Integer> futureVal = executorService.submit(()->{
            try{
                Thread.sleep(1000);
                System.out.println((id)+" Executed");
            }
            catch (InterruptedException e) {
                System.out.println(id+" Exception is here");
            }
            return (int)(Math.random()*100);
        });
            list1.add(futureVal);
        }
        executorService.shutdown();
        Thread.sleep(4000);
        executorService.shutdownNow();

    }
}
