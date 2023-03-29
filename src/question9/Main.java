package question9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> l = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> result = l.filter(e -> e%3==0)
                                .collect(Collectors.toUnmodifiableList());
        System.out.println(result);
    }
}
