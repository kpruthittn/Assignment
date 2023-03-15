package Question2;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {0,1, 2, 3, 4, 5};
            int result = numbers[6];
            int ans = numbers[0]/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred!");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
