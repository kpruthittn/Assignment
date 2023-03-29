import java.util.concurrent.locks.ReentrantLock;

public class Question2 {
    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            boolean islock1 = lock1.tryLock();
            boolean islock2 = lock2.tryLock();
            try {
                if(islock1) {
                    lock1.lock();
                }
                System.out.println("Thread 1 acquired Lock 1");
                Thread.sleep(2000);
                System.out.println("Thread 1 waiting for Lock 2");
                if(islock2) {
                    lock2.lock();
                }
                System.out.println("Thread 1 acquired Lock 2");
            } catch(InterruptedException | IllegalMonitorStateException e) {
                e.printStackTrace();
            }
            finally {
                if(islock1 && islock2) {
                    lock2.unlock();
                    lock1.unlock();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            boolean islock1 = lock1.tryLock();
            boolean islock2 = lock2.tryLock();
            try {
                if(islock2) {
                    lock2.lock();
                }
                System.out.println("Thread 2 acquired Lock 2");
                Thread.sleep(2000);
                System.out.println("Thread 2 waiting for Lock 1");
                if(islock1) {
                    lock1.lock();
                }
                System.out.println("Thread 2 acquired Lock 1");
            } catch(InterruptedException | IllegalMonitorStateException  e) {
                e.printStackTrace();
            }
            finally {
                if(islock1 && islock2) {
                    lock1.unlock();
                    lock2.unlock();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
