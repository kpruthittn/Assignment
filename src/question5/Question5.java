package question5;

class Employee{
    String fullName,city;
    Long salary;
    Employee(String firstName,String middleName,String lastName,String city,Long salary){
        this.fullName=firstName+" "+middleName+" "+lastName;
        this.city=city;
        this.salary=salary;
    }
}