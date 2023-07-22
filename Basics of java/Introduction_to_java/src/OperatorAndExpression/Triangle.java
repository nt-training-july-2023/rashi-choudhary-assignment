package OperatorAndExpression;

import java.util.Scanner;

public class Triangle {
    float base;
    float height;
    public Triangle(float base,float height){
        this.base=base;
        this.height=height;
    }
    public void Area( ){
        System.out.println("Area of traingle is :"+(0.5*height*base));
    }
    public static void main(String []args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter height of triangle");
        float height=scan.nextFloat();
        System.out.println("Enter base of triangle");
        float base=scan.nextFloat();
        Triangle tr1=new Triangle(base,height);
        tr1.Area();
    }
}
