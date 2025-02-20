package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService ex1 = Executors.newSingleThreadExecutor();
        ExecutorService ex2 = Executors.newFixedThreadPool(3);
        ExecutorService ex3 = Executors.newCachedThreadPool();

        List<Callable<Integer>> list1 = new ArrayList<>();
        List<Callable<Integer>> list2 = new ArrayList<>();
        List<Callable<Integer>> list3 = new ArrayList<>();

        for(int i=0;i<12;i++){
            final int id = i+1;
            list1.add(()->{return id;});
            list2.add(()->{return id;});
            list3.add(()->{return id;});
        }

        List<Future<Integer>> results1 = ex1.invokeAll(list1);
        for(int i=0;i<12;i++)
        {
            System.out.println(results1.get(i).get()+" Single thread executor");
        }
        results1 = ex2.invokeAll(list2);
        for(int i=0;i<12;i++)
        {
            System.out.println(results1.get(i).get()+" Fixed thread pool");
        }
        results1 = ex3.invokeAll(list3);
        for(int i=0;i<12;i++)
        {
            System.out.println(results1.get(i).get()+" Cached thread pool");
        }
        ex1.shutdown();
        ex3.shutdown();
        ex2.shutdown();
    }
}
