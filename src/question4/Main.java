package question4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream
                .iterate(5,e -> e<=20,e -> e+3)
                .forEach(System.out::println);
    }
}
