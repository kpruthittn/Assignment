package question3;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20)
                .filter(e -> e<=10)
                .forEach(System.out::println);
    }
}