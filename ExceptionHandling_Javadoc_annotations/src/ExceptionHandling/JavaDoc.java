package ExceptionHandling;

/**
 * Main class
 */
public class JavaDoc {
    /**
     * Default constructor for main class
     */
    public JavaDoc(){

    }
    /**
     * Main method to call Area class
     * @param args default argument
     */

    public static void main(String[]args) {
        Area area = new Area();
        double length = 10.5, breadth = 7, base = 6.7, height = 6, radius = 10;
        System.out.println("The Area of rectangle with length " + length + " and breadth " + breadth + " is " + area.rectangle(length, breadth));
        System.out.println("The Area of Triangle with base " + base + " and height " + breadth + " is " + area.triangle(base, height));
        System.out.println("The Area of circle of radius "+radius+" is "+area.circle(radius));
    }
}

/**
 * This class calculates the area of shapes
 */
class Area{
    /**
     *
     * @param length length of the rectangle
     * @param breadth breadth of rectangle
     * @return length*breadth the area of rectangle
     */
    public double rectangle(double length,double breadth){
        return length*breadth;
    }

    /**
     *
     * @param radius
     * @return the area of circle
     */
    public double circle(double radius){
        return Math.PI*radius*radius;
    }

    /**
     *
     * @param base
     * @param height
     * @return The area of rectangle
     */
    public double triangle(double base,double height){
        return 0.5*base*height;
    }

}

