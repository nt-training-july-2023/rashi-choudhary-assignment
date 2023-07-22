package StringHandling.StringOperation;

import java.util.Scanner;

public class CheckString {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.next();
        System.out.println("Enter the Character to check");
        char c=scan.next().charAt(0);
        if(str.charAt(0)==c)
            System.out.println("String starts with given character");
        else
            System.out.println("String does not starts with given character");
        System.out.println("Enter the String to check");
        String st=scan.next();
        if(str.indexOf(st)==0)
            System.out.println("String starts with given string");
        else
            System.out.println("String does not starts with given string");
    }
}
