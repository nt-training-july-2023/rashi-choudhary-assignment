package StringHandling.MoreStringMethods;

import java.util.Scanner;

//check if the string1 is lexicographically smaller than string2
public class CompareString {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = scan.next();
        System.out.println("Enter the second String");
        String str2 = scan.next();
        if (str1.compareTo(str2) < 0) {
            System.out.println("String1 is smaller");
        } else {
            if (str1.compareTo(str2) > 0)
                System.out.println("String2 is smaller");
            else
                System.out.println("Strings are equal");
        }
    }

}
