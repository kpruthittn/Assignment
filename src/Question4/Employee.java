package Question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee{
    private String name,designation;
    private int age;
    Employee(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }

    public String toString(){
        return "Name: "+ name +", Age: "+ age +", Designation: "+designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,this.age,this.designation);
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return emp.name.equals(this.name) && emp.age == this.age && emp.designation.equals(this.designation);
    }
}
