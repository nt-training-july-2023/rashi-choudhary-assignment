package IterationStatements;

import java.util.Scanner;

public class ReverseNumber {
    public ReverseNumber(){

    }
    public int length(int num){
        int len=0;
        while(num>0){
            len++;
            num=num/10;
        }
        return len;
    }
    public int reverseNumber(int num){
        int length=length(num);
        int reverseNum=0;
        while(num>0){
            reverseNum+=(num%10)*Math.pow(10,--length);
            num=num/10;
        }
        return reverseNum;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num=scan.nextInt();
        ReverseNumber rn=new ReverseNumber();
        System.out.println("The reverse of "+num+" is "+rn.reverseNumber(num));
    }
}
