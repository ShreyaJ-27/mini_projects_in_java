import java.util.Scanner;

//SHOPPING CART PROGRAM
public class shopping_cart_program {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        double total;
        char currency = '$';
        System.out.print("What would you like to buy?: ");
        item = sc1.nextLine();
        System.out.print("How many would you like to buy?: ");
        quantity = sc1.nextInt();
        System.out.print("What is the price for each?: ");
        price = sc1.nextDouble();
        total = price * quantity;
        System.out.println("\npizzaYou have brought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        sc1.close();
    }
}

