package Question1;

import java.util.Scanner;
public class Main {
    enum House {
        BOAT_HOUSE("Boat_House", 19900000),
        PENT_HOUSE("Pent House", 29900000),
        MANSION("Mansion", 39900000),
        VILLA("Villa", 49900000);

        private final String name;
        private final double price;

        House(String name, double price) {

            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select From the following to see the price and information- \n 1. For Boat House \n 2. For Pent House \n 3. For Mansion \n 5. For Villa ");
        int number = sc.nextInt();

        switch (number) {
            case 1 -> {
                House flat = House.BOAT_HOUSE;
                System.out.println("Cost of "+flat.name+" is: Rs "+flat.getPrice());
            }
            case 2 -> {
                House apartment = House.PENT_HOUSE;
                System.out.println("Cost of "+apartment.name+" is: Rs "+apartment.getPrice());
            }
            case 3 -> {
                House vila = House.MANSION;
                System.out.println("Cost of "+vila.name+" is: Rs "+vila.getPrice());
            }
            case 4 -> {
                House mansion = House.VILLA;
                System.out.println("Cost of "+mansion.name+" is: Rs "+mansion.getPrice());
            }

            default -> System.out.println("Enter a valid choice");
        }


    }
}
