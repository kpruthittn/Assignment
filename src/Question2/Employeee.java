package Question2;

public class Employeee implements Comparable<Employeee>{
    int age;
    double salary;
    String name;
    Employeee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void showInfo(){
        System.out.println("Name: " + name + ", Age: " + age + " and Salary: " + salary);
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public int compareTo(Employeee e){
        return this.getName().compareTo(e.getName());
    }
}
