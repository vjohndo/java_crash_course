public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        double sine = Math.sin(1.2);
        System.out.println("Sine of 1.2 is " + sine);

        double power = Math.pow(2,3);
        System.out.println("power is " + power);

        double random = Math.random() * 100; // returns a random number between 0 and 1
        System.out.println(random);
    }   
}
