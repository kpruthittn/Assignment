package Question4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pranshu", 21, "Trainee");
        Employee e2 = new Employee("Nitin", 27, "SDE");
        Employee e3 = new Employee("Mehar", 32, "QE");
        HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();
        map.put(e1, 100000);
        map.put(e2, 200000);
        map.put(e3, 150000);

        for (Map.Entry<Employee, Integer> x : map.entrySet()) {
            System.out.println(x.getKey() + ", Salary : " + x.getValue());
        }
    }
}
