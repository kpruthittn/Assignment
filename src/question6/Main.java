package question6;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(5);
        Stream<Integer> s = op.stream();
        s.forEach(System.out::println);
    }
}
