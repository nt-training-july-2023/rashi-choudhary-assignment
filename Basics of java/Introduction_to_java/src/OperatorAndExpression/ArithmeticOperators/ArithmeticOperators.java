package OperatorAndExpression.ArithmeticOperators;

import java.util.Scanner;

public class ArithmeticOperators {
    int operand1;
    int operand2;
    public ArithmeticOperators(int operand1,int operand2){
        this.operand1=operand1;
        this.operand2=operand2;
    }
    public void addition(){
        System.out.println(operand1+" + "+operand2+" = "+(operand1+operand2));
    }
    public void subtraction(){
        System.out.println(operand1+" - "+operand2+" = "+(operand1-operand2));
    }
    public void multiplication(){
        System.out.println(operand1+" * "+operand2+" = "+(operand1*operand2));
    }
    public void division(){
        System.out.println(operand1+" / "+operand2+" = "+(operand1/operand2));
    }
    public void modulus(){
        System.out.println(operand1+" % "+operand2+" = "+(operand1%operand2));
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter operand1");
        int num1=scan.nextInt();
        System.out.println("Enter operand2");
        int num2=scan.nextInt();
        ArithmeticOperators ao=new ArithmeticOperators(num1,num2);
        ao.addition();
        ao.subtraction();
        ao.multiplication();
        ao.division();
        ao.modulus();
    }
}
