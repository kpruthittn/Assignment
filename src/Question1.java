import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Question1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable run = () -> {
            System.out.println(Thread.currentThread().getName() + " process started");
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e) {
                System.out.println("Interrupted exception occurred");
            }
            System.out.println(Thread.currentThread().getName() + " process completed");
        };

        Thread t1 = new Thread(run, "Thread1");
        t1.start();

        Callable callable = () -> {
            System.out.println(Thread.currentThread().getName() + " process started");
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e) {
                System.out.println("Interrupted exception occurred");
            }
            System.out.println(Thread.currentThread().getName() + " process completed");
            return 8;
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread t2 = new Thread(futureTask);
        t2.start();
        System.out.println("Tasks are about to get completed");
        Integer value = futureTask.get();
        System.out.println("Returned values: " + value);
    }
}
