import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = 0.02;
        String trash = "";



        System.out.print("Enter the item price: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the buffer

            if(itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else //Have to pay ship cost
            {
                shipCost = itemPrice * SHIP_RATE;
                totalCost = itemPrice + shipCost;


            }
            // Display Results
            System.out.println("Shipping costs are: " + shipCost);
            System.out.println("Toal costs are: " + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
            System.out.println("Run the program again with correct input.");
        }

    }
}