package StringHandling.MoreStringMethods;

import java.util.Scanner;
//Returns the position of the last found occurrence of specified characters in a string
public class StringLastIndex {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = scan.next();
        System.out.println("Enter the Character");
        char c=scan.next().charAt(0);
        System.out.println("The last index of character "+c+" is "+str1.lastIndexOf(c));
    }
}
