package IterationStatements;

import java.util.Scanner;

public class PalindromeNumber {


    public static void main(String[]args){
        ReverseNumber rv=new ReverseNumber();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int num=scan.nextInt();
        int revNum=rv.reverseNumber(num);
        if(num==revNum)
            System.out.println("Number "+num+" is Palindrome");
        else
            System.out.println("Number "+num+" is not Palindrome");
    }
}
