package VariableAndLiterals;

import java.util.Scanner;

public class NamingConventions {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        //This is not the right way of naming .The first letter should start with lowercase
        //String FirstName="Aman";
        String FirstName;
        System.out.println("Enter First Name");
        FirstName=scanner.next();
        //variable should not start with special letters
        //String $lastName;
        String LastName;
        System.out.println("Enter Last Name");
        LastName=scanner.next();
        System.out.println("The full name is "+FirstName+" "+LastName);
    }
}
