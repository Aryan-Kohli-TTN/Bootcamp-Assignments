package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        int sum=0;
        for (int i = 0; i < 5; i++) {
            final int id = i+1;
            Future<Integer> val = executorService.submit(()->{
                return id*100+id;
            });
            try {

                sum+=val.get();
            }
            catch (Exception e)
            {
                System.out.println("exception");
            }
        }
        executorService.shutdown();
        System.out.println(sum);
    }
}
