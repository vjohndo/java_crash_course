import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two intergers on same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
          
        System.out.println("Enter two big intergers on same line");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("Enter two doubles");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two text values");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\tIntergers: " + num1 + " " + num2);
        System.out.println("\tBIntergers: " + bigNum1 + " " + bigNum2);
        System.out.println("\tDec: " + decimal1 + " " + decimal2);
        System.out.println("\tWords: " + text1 + " " + text2);
    }  
}
