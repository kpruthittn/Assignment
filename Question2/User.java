package Question2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return firstName + "," + lastName + "," + age + "," + phoneNumber;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        try(FileWriter file=new FileWriter("src/Question2/user.txt",true)) {
        while (true) {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            User user=new User(firstName,lastName,age,phoneNumber);
            file.write(user+"\n");
            System.out.print("Do you want to continue creating users? (Type QUIT to exit):(Press Enter to add more) ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("QUIT")) {
                break;
            }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }
}

