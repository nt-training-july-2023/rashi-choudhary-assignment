package IterationStatements;

import java.util.Scanner;

public class Factorial {
    int num;
    public Factorial(int num){
        this.num=num;
    }
    public int factorial(){
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int num=scan.nextInt();
        Factorial fc=new Factorial(num);
        System.out.println(fc.factorial());
    }
}
