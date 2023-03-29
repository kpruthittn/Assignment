package question2;
interface Create {
    default void showDefault(){
        System.out.println("Default Method of an interface created");
    }
    static void showStatic(){
        System.out.println("Static Method of an interface created");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Create c = new Create(){};
        c.showDefault();
        Create.showStatic();
    }
}
