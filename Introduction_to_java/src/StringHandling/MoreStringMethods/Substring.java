package StringHandling.MoreStringMethods;

import java.util.Scanner;
// find substring of string by taking start index and end index;
public class Substring {

        public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the String");
            String str1 = scan.next();

            System.out.println("Enter start index");
            int start=scan.nextInt();
            System.out.println("Enter last index");
            int end=scan.nextInt();
            if(start<0||end>str1.length())
                System.out.println("Substring is not possible");
            else
                System.out.println("Substring is "+str1.substring(start,end));
        }

}
