import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // create a new instance of a scan object
        System.out.println("Welcome. Thank you for taking the survey");
        int counter = 0;

        
        System.out.println("What is your name?");
        String name = scan.nextLine(); // Expects a string input
        counter++;

        System.out.println("\n How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble(); // Expects a double input
        counter++;

        System.out.println("\n How much money do you spend of fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\n How many times a day do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\n How many times a day do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\n Thank you " + name + " for answering all " + counter + " questions.");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee prices");
        scan.close();
    }
}
