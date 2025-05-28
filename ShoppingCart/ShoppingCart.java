import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.print("What would you like to buy today: ");
        item = scanner.nextLine();
        System.out.print("How much is each item: ");
        price = scanner.nextDouble();
        System.out.print("How many would you want: ");
        quantity = scanner.nextInt();

        total = price * quantity;


        System.out.println("\nYou have bought: "+quantity+ " " +item+ "/s");

        System.out.println("Your total is " +currency +total);


        scanner.close();

    }
}
