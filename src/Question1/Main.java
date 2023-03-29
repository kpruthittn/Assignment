package Question1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Float> n = new ArrayList<Float>();
        n.add(1F);
        n.add(22F);
        n.add(14F);
        n.add(91F);
        n.add(18F);

        Iterator i = n.iterator();
        float sum=0;
        while(i.hasNext()){
            sum+=(float)i.next();
        }
        System.out.println("Sum is " + sum);
    }
}
