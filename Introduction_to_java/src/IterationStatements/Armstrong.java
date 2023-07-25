package IterationStatements;

import java.util.Scanner;

public class Armstrong {
    int num;


    public int length(int num){
        int length=0;
        int a=num;
        while (a>0){

            length++;
            a=a/10;
        }
       return length;
    }
    public boolean checkArmstrong(int num){
        int len=length(num);
        System.out.println(len);
        int temp=num;
        int sum=0;
        while(num>0){
            int r=num%10;
            sum+=Math.pow(r,len);
            num=num/10;
        }
        if(sum==temp) return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        Armstrong ar=new Armstrong();

        if(ar.checkArmstrong(num))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
