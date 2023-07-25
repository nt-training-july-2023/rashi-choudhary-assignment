package StringHandling.StringOperation;

import java.util.Scanner;

public class GetCharacter {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.next();
        System.out.println("Enter the position");
        int a=scan.nextInt();
        System.out.println("The character at the position "+a+" is "+str.charAt(a-1));
    }
}
