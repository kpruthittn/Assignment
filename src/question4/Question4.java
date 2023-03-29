package question4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,12,23,34,45,56,67,78,89,90);
        Optional<Integer> op = list.stream()
                .filter(e -> e<60)
                .reduce(Integer::sum);
        if(op.isPresent()){
            System.out.println(op.get());
        }else {
            System.out.println("No values are less than 60");
        }
    }
}
