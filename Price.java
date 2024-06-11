package sakshi.com;

import java.util.Scanner;

public class Price {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Curiosity is the starting point for growth.");
            System.out.println("Enter the quantity:");
            int quantity = sc.nextInt();
            System.out.println("Enter the price:");
            int price = sc.nextInt();
            double total = quantity * price;
            System.out.println("Total is: " + total);

            System.out.println("Do you want to perform again? (yes/no)");
            String user = sc.next();

            if (!user.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        
    }
}
