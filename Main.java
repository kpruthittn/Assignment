public class Main {
    public static void main(String[] args) {
        System.out.println("Initial");
        display();
        System.out.println("end");

    }
    public static void display(){
        display1();
        System.out.println(1);
    }
    public static void display1(){
        display2();
        System.out.println(2);
    }
    public static void display2(){
        try {
            System.out.println(10 / 0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(3);
    }
}