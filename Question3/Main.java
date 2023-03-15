package Question3;

public class Main {
    public static void main(String[] args) {
        try {
            test example = new test();
            example.method();
        } catch (NoClassDefFoundError e) {
            System.out.println("Caught NoClassDefFoundError: " + e.getMessage());
        }

        // Producing ClassNotFoundException
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}

