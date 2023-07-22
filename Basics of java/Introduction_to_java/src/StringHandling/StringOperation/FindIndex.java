package StringHandling.StringOperation;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.next();
        System.out.println("Enter the Character to find index");
        char c=scan.next().charAt(0);
        System.out.println("Index of character is "+str.indexOf(String.valueOf(c)));
        System.out.println("Enter the String to find index");
        String st=scan.next();
        System.out.println("Index of string is "+str.indexOf(st));
    }
}
