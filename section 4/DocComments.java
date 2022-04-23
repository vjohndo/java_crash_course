public class DocComments {
    public static void main(String[] args) {

    }   
    
    /**
     * Functino name: greet
     * 
     * Inside the function:
     *  1. prints: "Hi"
     */

    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     * @param name
     * @param age
     * 
     * Inside the fucntion:
     *  1. prints the name nad age as part of a text
     * 
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'm" + name + " and I'm " + age + " years old.");
    }

    /**
     * Function name: calcaulteArea
     * 
     * @param length    (double)
     * @param width     (double)
     * @return          (double)
     * 
     * Inside the function:
     *  1. Calculate the area and returns it
     * 
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

}
