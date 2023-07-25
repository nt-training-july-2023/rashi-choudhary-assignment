package StringHandling.StringOperation;

import java.util.Scanner;

public class StringLength {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.next();
        System.out.println("The length of string "+str+" is "+str.length());
    }
}
