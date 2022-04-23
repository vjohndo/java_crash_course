import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Number can not be less than 1.");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6)  {
            System.out.println("Number can not be bigger than 6.");
            System.exit(0);
        }

        int sumOfNumber = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Comp rolls: " + roll1 + " " + roll2  + " " + roll3);

        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumber + ".");
        
        if (checkWin(sumDiceRolls, sumOfNumber)) {
            System.out.println("Congrats! You win");
        } else {
            System.out.println("Sorry! you lose");
        }

        scan.close();
    }   
    
    public static int rollDice() {
        double randomNumber = Math.random() * 6; // 0 --> 5.99
        randomNumber += 1; // 1 --> 5.99
        return (int)randomNumber;
        
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumber) {
        return (sumDiceRolls > sumOfNumber && sumOfNumber - sumDiceRolls < 3);
    }
}
