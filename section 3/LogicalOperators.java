public class LogicalOperators {
    public static void main(String[] args) {
        int chemGrade = 78;
        int engGrade = 65;
        String lang = "Java";

        if (chemGrade > 75 || engGrade > 75 || lang.equals("Java")) {
            System.out.println("You got scholar");
        } else {
            System.out.println("No Scholar");
        }
    }
}