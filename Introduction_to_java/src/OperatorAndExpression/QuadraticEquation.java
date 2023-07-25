package OperatorAndExpression;

import java.util.Scanner;

public class QuadraticEquation {
    float a;
    float b;
    float c;
    public QuadraticEquation(float a,float b,float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void roots(){
        float d= (float) Math.sqrt((b*b)-(4*a*c));
        float root1=((-b)+d)/(2*a);
        float root2=((-b)-d)/(2*a);
        System.out.println("The roots are "+root1+" and "+root2);

    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        float a=scan.nextFloat();
        System.out.println("Enter the value of b ");
        float b=scan.nextFloat();
        System.out.println("Enter the value of c ");
        float c=scan.nextFloat();
        QuadraticEquation qd=new QuadraticEquation(a,b,c);
        qd.roots();
    }
}
