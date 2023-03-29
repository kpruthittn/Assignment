package Question1;

public class Question1 implements Runnable{
    public void run(){
        System.out.println("Runnable Interface is called");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        t1.start();
        t1.sleep(3000);
        t2.start();
        t2.join();
    }
}
