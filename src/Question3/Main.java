package Question3;

public class Main {
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack(5);
        s.isEmpty();
        s.pop();
        s.push(12);
        s.push(54);
        s.push(49);
        s.push(91);
        s.push(3);
        s.push(24);
        s.isFull();
        s.pop();
        s.pop();
        s.getMin();
    }
}
