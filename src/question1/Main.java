package question1;
interface A{
    private void showInfo(){
        System.out.println("This is private method");
    }
    default void defaultMethod(){
        showInfo();
    }
}
public class Main {
    public static void main(String[] args) {
        A objA = new A(){};
        objA.defaultMethod();
    }
}
