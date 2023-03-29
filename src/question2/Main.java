package question2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,12,21,33,45,53,64);
        System.out.println("Take whiile: ");
        list.stream()
                .takeWhile(e -> e<40)
                .forEach(System.out::println);
        System.out.println("Drop whiile: ");
        list.stream()
                .dropWhile(e -> e<40)
                .forEach(System.out::println);
    }
}
