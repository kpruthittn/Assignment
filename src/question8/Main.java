package question8;

class Cricket implements AutoCloseable{
    public void displayWorldCup(){
        System.out.println("Streaming Cricket World Cup");
    }
    public void close(){
        System.out.println("Cricket World Cup ended");
    }
}class Football implements AutoCloseable{
    public void displayWorldCup(){
        System.out.println("Streaming Football World Cup");
    }
    public void close(){
        System.out.println("Football World Cup ended");
    }
}
public class Main {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        Football football = new Football();
        try (cricket;football){
            cricket.displayWorldCup();
            football.displayWorldCup();
        }
    }
}
