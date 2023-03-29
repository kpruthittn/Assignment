package question3;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,21,6,32,43,1,4);
        int result = (list.stream()
                .filter(e -> e>5)
                .reduce(0,(n1,n2) -> n1+n2));
        System.out.println("Sum is "+result);
    }
}
