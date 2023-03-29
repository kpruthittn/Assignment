import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Command implements Runnable
{
    private int id;

    public Command(int id) {
        this.id = id;
    }

    public void run() {
        try {
            System.out.println("Thread starts executing");
            Thread.sleep(1000);
            System.out.println("Thread stop executing");
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Question5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0; i < 5; i++) {
            executorService.submit(new Command(i));
        }
        executorService.shutdown();

        if(!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("Executor running");
            List<Runnable> runningTasks = executorService.shutdownNow();
            System.out.println("Total Running Tasks : " + runningTasks.size());
        }
    }
}
