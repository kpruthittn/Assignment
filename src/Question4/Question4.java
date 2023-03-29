package Question4;

public class Question4 {
    public static void main(String args[]){

        String l1 = "Pranshu";
        String l2 = "Saluja";

        Thread thread1 = new Thread(()->{
            synchronized (l1){
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println("Interrupted Exception occurred");
                }
                synchronized(l2){
                    System.out.println("Lock 2 Acquired");
                }
            }
        }) ;

        Thread thread2 = new Thread(() -> {
            synchronized (l2){
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println("Interrupted Exception occurred");
                }
                synchronized(l1){
                    System.out.println("Lock Acquired");
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("Main is getting executed");

    }

}
