import java.util.Scanner;
public class Question3 {

    public static double area(int r)
    {
        return 3.14 * r * r;
    }

    public static double circumference(int r)
    {
        return 2*3.14*r;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r = scn.nextInt();
        System.out.println("\n Enter 1 for calculating the area of the circle. \n Enter 2 for calculating the circumference of the circle \n Enter 3 to exit.");
        int n = scn.nextInt();


        switch (n)
        {
            case 1 : System.out.println(area(r));
            break;
            case 2 : System.out.println(circumference(r));
            break;
            case 3 : break;
            default : System.out.println("\n Enter  the correct value");
        }

    }
}
