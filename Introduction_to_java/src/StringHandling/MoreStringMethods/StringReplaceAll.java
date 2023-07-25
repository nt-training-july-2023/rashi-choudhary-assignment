package StringHandling.MoreStringMethods;

import java.util.Scanner;

//replace all character of string with given string
public class StringReplaceAll {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = scan.next();
        System.out.println("Enter the character to replace");
        char c=scan.next().charAt(0);
        System.out.println("Enter the character to place");
        char d=scan.next().charAt(0);
        System.out.println("The modified string will be "+ str1.replaceAll(String.valueOf(c),String.valueOf(d)));


    }
}
