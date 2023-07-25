package IterationStatements;

import java.util.Scanner;

public class MultiplicationTable {
    int num;
    public MultiplicationTable(int num){
        this.num=num;
    }
    public void table(){
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+ (num*i));
        }
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();
        MultiplicationTable mt=new MultiplicationTable(num);
        mt.table();
    }
}
