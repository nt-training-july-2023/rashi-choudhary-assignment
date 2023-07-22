package IterationStatements;

import java.util.Scanner;

public class Sum {
    int num;
    public Sum(int num){
        this.num=num;
    }
    public int sum(){
        int sum=0;
        for(int i=num;i>0;i--){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n= scan.nextInt();
        Sum sum=new Sum(n);
        System.out.println(sum.sum());
    }
}
