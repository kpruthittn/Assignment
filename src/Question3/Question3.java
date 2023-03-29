package Question3;
class OperationA extends Thread{
    private int number;
    OperationA(int n){
        this.number=n;
    }
    public void run(){
        for(int v1=number; v1<5;v1++){
            System.out.println("Operation A " + v1);
        }
    }
}
class OperationB extends Thread{
    private int number;
    OperationB(int n){
        this.number=n;
    }
    public void run(){
        for(int v2=number; v2<5;v2++){
            System.out.println("Operation B " + v2);
        }
    }
}

public class Question3 {
    private static volatile int number = 0;
    public static void main(String[] args) {
        new OperationA(number).start();
        new OperationB(number).start();

    }
   }

