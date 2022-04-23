import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println(" . Selection option 'a' to buy");
        System.out.println(" . Selection option 'b' to buy\n");

        String option = scan.nextLine(); // Note that nextLine will return a string, hence no char

        switch(option) {
            case "a": 
                System.out.println("\nWhat is your burdget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A nissan Altima is available");
                    System.out.println("\nDo you have insurance? (yes or no)");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? (yes or no)");
                    String license = scan.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 6) {
                        System.out.println("Sold! Pleasure doing business with you!");
                    } else {
                        System.out.println("We're sorry. You are not eligible");
                    }

                } else {
                    System.out.println("We don't sell anything that cheap");
                }
            break;
            case "b": 
                System.out.println("\nWhat value car?");
                int value = scan.nextInt();
                System.out.println("What price?");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("We will buy your car. Pleasure");
                } else {
                    System.out.println("Sorry no thanks");
                }
                
            break;
            default: System.out.println("\nNo understand");
        }

        scan.close();
    }    
}
