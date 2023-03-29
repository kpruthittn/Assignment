package Question2;

class Football{
    synchronized void ElClasico(String venue){
        for (int i = 0; i < 1; i++) {
            System.out.println("Match at "+venue);
        }
    }
    void Match(String ground){
        synchronized (this){
            for (int i = 0; i < 1; i++) {
                System.out.println("Is played at " + ground);
            }
        }
    }
}

class Barcelona extends Thread{
    Football f;
    Barcelona(Football f){
        this.f=f;
    }
    public void run(){
        f.ElClasico("Camp Nou");
        f.Match("Home ground");
    }
}

class RealMadrid extends Thread{
    Football f;
    RealMadrid(Football f){
        this.f=f;
    }
    public void run(){
        f.ElClasico("Bernbau");
        f.Match("Away ground");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Football o = new Football();
        Barcelona b = new Barcelona(o);
        RealMadrid rm = new RealMadrid(o);
        b.start();
        rm.start();
    }
}
