//Design a Java program that asks the user to enter a password. Check if the password meets
//        the criteria of having at least eight characters, containing both letters and numbers. If the
//        password does not meet the criteria, throw a custom exception called
//        InvalidPasswordException with a suitable message. Implement the
//        InvalidPasswordException class.
package ExceptionHandling;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String str;
        try{
            System.out.println("Enter password");
            str=scan.next();
            if(str.length()<8||str.matches("^[a-zA-Z0-9]*$"))
                throw new InvalidPasswordException("Password should have at least eight characters, containing both letters and numbers");
        }
        catch (InvalidPasswordException e){
            System.out.println(e);
        }
    }
}
class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String str){
        super(str);
    }
}

