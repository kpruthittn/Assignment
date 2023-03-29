package question11;

record Student(String name,int id,int age){
    static int count = 0;
    Student{
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Pranshu",15,21);
        Student s2 = new Student("Mehar",20,40);
        Student s3 = new Student("Nitin",10,11);

        System.out.println(Student.count);
    }
}
