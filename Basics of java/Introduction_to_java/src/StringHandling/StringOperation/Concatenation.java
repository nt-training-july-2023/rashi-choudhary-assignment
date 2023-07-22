package StringHandling.StringOperation;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = scan.next();
        System.out.println("Enter the second string");
        String str2 = scan.next();
        System.out.println("The concatenation of string1 and string2 is "+str1.concat(str2));
    }
}
