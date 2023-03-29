import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question3 {
    public static void main(String[] args) {
        List<Callable<String>> list = new ArrayList<>();

        list.add(() -> {
            Thread.sleep(1000);
            return "Command 1";
        });
        list.add(() -> {
            Thread.sleep(1500);
            return "Command 2";
        });
        list.add(() -> {
            Thread.sleep(2000);
            return "Command 3";
        });

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        try {
            List<Future<String>> futures = executorService.invokeAll(list);
            for(Future<String> future : futures) {
                System.out.println(future.get());
            }
        }
        catch(InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            executorService.shutdown();
        }
    }
}
