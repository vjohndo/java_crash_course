import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("\nF Name?");
        String firstName = scan.nextLine();

        //Ask for their last name.
        System.out.println("\nL Name?");
        String lastName = scan.nextLine();

        //Ask: how old are you?
        System.out.println("\nOld?");
        int age = scan.nextInt();

        scan.nextLine(); // Need to add a throw away next line
        //Ask them to make a username.
        System.out.println("\nUser?");
        String username = scan.nextLine();

        //Ask what city they live in.
        System.out.println("\nCity?");
        String city = scan.nextLine();

        //Ask what country that's from.
        System.out.println("\nCountry?");
        String country = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println("Your informatin:");
        System.out.println("\tF Name: " + firstName);
        System.out.println("\tL Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tuser: " + username);
        System.out.println("\tcity: " + city);
        System.out.println("\tcountry: " + country);

        scan.close();
        //close scanner. It's good practice :D ! 
    }
}