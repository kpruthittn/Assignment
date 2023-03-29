package question6;

import java.time.LocalDate;
import java.util.Scanner;

public class Question6_Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the day(1-31) of first date: ");
        int d1 = scn.nextInt();
        System.out.println("Enter the month(1-12) of first date: ");
        int m1 = scn.nextInt();
        System.out.println("Enter the year of first date: ");
        int y1 = scn.nextInt();
        LocalDate date1 = LocalDate.of( y1 , m1 , d1 );
        System.out.println("Enter the day(1-31) of first date: ");
        int d2 = scn.nextInt();
        System.out.println("Enter the month(1-12) of first date: ");
        int m2 = scn.nextInt();
        System.out.println("Enter the year of first date: ");
        int y2 = scn.nextInt();
        LocalDate date2 = LocalDate.of( y2 , m2 , d2 );
        boolean result = date1.isBefore(date2);
        if (result){
            System.out.println("Date: "+date1+" occured before "+date2);
        }else {
            System.out.println("Date: "+date1+" occured after "+date2);
        }
    }
}
