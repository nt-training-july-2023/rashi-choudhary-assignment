package StringHandling.StringOperation;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scan.next();
        System.out.println("Enter the character to replace");
        char c =scan.next().charAt(0);
        System.out.println("Enter the character to replace the entered character with");
        char d =scan.next().charAt(0);
        System.out.println("The new String is "+str.replace(c,d));
    }
}
