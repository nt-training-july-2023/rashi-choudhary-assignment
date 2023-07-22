package StringHandling.MoreStringMethods;

import java.util.Scanner;

//checking if a string contains a given pattern or not
public class StringContains {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = scan.next();
        System.out.println("Enter the Pattern");
        String pattern = scan.next();
        if(str1.contains(pattern))
            System.out.println("pattern is present in the string");
        else
            System.out.println("pattern is not present in the string");

    }
}
