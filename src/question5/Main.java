package question5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(10);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .filter(e -> e>5)
                .findFirst()
                .ifPresentOrElse(System.out::println,() -> System.out.println("Number is not present"));
        list.stream()
                .filter(e -> e>10)
                .findFirst()
                .or(() -> op)
                .ifPresentOrElse(System.out::println,() -> System.out.println("Value don't exists"));
        list.stream()
                .filter(e -> e>10)
                .findFirst()
                .orElseThrow();
    }
}
