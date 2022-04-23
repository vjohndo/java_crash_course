public class Parameters {
    public static void main(String[] args) {
        measureRectangle(16.0, 4.3);
    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area with length " + length + ", width," + width + " is " + area);

    }
}
