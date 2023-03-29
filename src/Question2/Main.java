package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortingSalary implements Comparator<Employeee>{
    public int compare(Employeee e1,Employeee e2){
        if(e1.salary== e2.salary){
            return 0;
        } else if(e1.salary > e2.salary){
            return 1;
        }else {
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Employeee> e=new ArrayList<>();
        e.add(new Employeee("Pranshu",22,100000));
        e.add(new Employeee("Mohit",22,100000));
        e.add(new Employeee("Divyanshu",25,300000));
        e.add(new Employeee("Yaman",32,200000));
        e.add(new Employeee("Rocky",28,150000));

        Collections.sort(e,new SortingSalary());
        for(Employeee s:e){
            s.showInfo();
        }
    }
}
