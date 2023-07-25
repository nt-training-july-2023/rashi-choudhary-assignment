//Write a Java program that contains a method to calculate the area of a rectangle. The
//        method takes two positive integer parameters representing the length and width of the
//        rectangle. However, the method should throw a custom exception called
//        “InvalidDimensionException” if either the length or width is less than or equal to zero.
//        Implement the “InvalidDimensionException” class with an appropriate message. Test the
//        method with valid and invalid inputs.
package ExceptionHandling;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        float length,width;
        try{
            System.out.println("Enter length of triangle");
            length=scan.nextFloat();
            System.out.println("Enter width of triangle");
            width=scan.nextFloat();
            if(length<=0||width<=0){
                throw new InvalidDimensionException("Dimensions should be greater than zero");
            }
        }
        catch (InvalidDimensionException e){
            System.out.println(e);
        }
    }
}
class InvalidDimensionException extends Exception{
    public InvalidDimensionException(String str){
        super(str);
    }
}
