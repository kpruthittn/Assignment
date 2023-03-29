package question12;

sealed class Football permits Messi,Ronaldo {
    void display(){
        System.out.println("Sealed class Football is created");
    }
}
final class Messi extends Football {}
final class Ronaldo extends Football {}

public class Main {
    public static void main(String[] args) {
        Messi m = new Messi();
        m.display();
        Ronaldo r = new Ronaldo();
        r.display();
    }
}
