public class IfElse {
    public static void main(String[] args) {
        int grade = 65;

        if (grade > 80) {
            System.out.println("You got an A");
        } else if (grade >= 70) {
            System.out.println("You got a B");
        } else {
            System.out.println("Not bothered to print out the rest");
        }
    }
}