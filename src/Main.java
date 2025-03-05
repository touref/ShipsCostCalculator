import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int priceItem = 0;
        double shippingRate = 0.02;
        double totalCost;

        System.out.println("Enter the price of the item: ");

        if (in.hasNextInt()) {
            priceItem = in.nextInt();

            if (priceItem >= 100) {
                System.out.println("Shipping is free");
                totalCost = priceItem;
            } else {
                System.out.println("Shipping is not free");
                double shippingCost = priceItem * shippingRate;
                totalCost = priceItem + shippingCost;
                System.out.println("Shipping cost is: " + shippingCost);

            }

            System.out.println("The total cost of the item is: " + totalCost);
        } else {
            String trash = in.nextLine();
            System.out.println("You entered: " + trash);
            System.out.println("Run the program again with a valid integer input for the item price.");
        }

        in.close();
    }
}