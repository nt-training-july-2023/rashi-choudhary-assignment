package AssignmentQuestions;
//Create a functional interface with the name ‘Shape’ and a method ‘area’. Write a program to implement this interface for shapes, rectangle, square, circle, cube, sphere, cylinder and find out its area. All the implementation should be within a single class.
public class ShapeArea {
    public static void main(String[]args){
        float rLength=10,rBreadth=20;
        float circleRadius=7;
        float side=5;
        float sphereRadius=8;
        float cylinderRadius=9,cylinderHeight=3;
        Shape rectangle=()->{
            System.out.println("The area of rectangle with length "+rLength+" and breadth "+rBreadth+" is "+(rLength*rBreadth));
        };
        Shape circle=()->{
            System.out.println("The Area of circle with radius "+circleRadius+" is "+(Math.PI*circleRadius*circleRadius));
        };
        Shape square=()->{
            System.out.println("The Area of square with side "+side+" is "+(side*side));
        };
        Shape sphere=()->{
            System.out.println("The Area of sphere with radius "+sphereRadius+" is "+(4*Math.PI*sphereRadius*sphereRadius));
        };
        Shape cylinder=()->{
            double area=(2*Math.PI*circleRadius*cylinderHeight)+(2*Math.PI*circleRadius*circleRadius);
          System.out.println("The Area of cylinder with radius "+cylinderRadius+" and height "+cylinderHeight+" is "+area);
        };
        circle.area();
        sphere.area();
        rectangle.area();
        cylinder.area();
        square.area();

    }
}
interface Shape{
    void area();
}
