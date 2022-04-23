public class ReturnValue {
    public static void main(String[] args) {
        double measure1 = measureRectangle(-5, 15, "area");
        double measure2 = measureRectangle(21, 15, "perimeter");

        stringPrinter(20, 15, measure1, "area");
        stringPrinter(20, 25, measure2, "perimeter");
    }

    public static double measureRectangle(double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("Can't be negative");
            System.exit(0);
        }
        
        switch(option) {
            case "area": return length * width; // return already breaks the function
            case "perimeter": return 2*(length + width);
            default: return 404;
        }
    }

    public static void stringPrinter(double length, double width, double result, String option) {
        System.out.println("L: " + length + " W: " + width + " " + option + ": " + result);
    }
}