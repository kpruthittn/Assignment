interface Addition{
    void add(int n1,int n2);
}
interface Subtract{
    void sub(int n1,int n2);
}
interface Multiplication{
    void multiply(int n1,int n2);
}
class B{
    int n1,n2;
    void add(int n1,int n2){
        System.out.println("Sum is "+(n1+n2));
    }
    void sub(int n1,int n2){
        System.out.println("Difference is "+(n1-n2));
    }
    public static void multiply(int n1,int n2){
        System.out.println("Product is "+(n1*n2));
    }
}
public class Question2 {
    public static void main(String[] args) {
        Addition a = new B()::add;
        a.add(12,45);
        Subtract s = new B()::sub;
        s.sub(47,23);
        Multiplication m = B::multiply;
        m.multiply(12,20);
    }
}