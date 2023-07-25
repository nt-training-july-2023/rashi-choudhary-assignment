//Design a Java program that simulates an ATM machine. Prompt the user to enter their
//account balance and the amount they want to withdraw. Handle the scenario where the
//user enters non-numeric or negative values for balance or withdrawal amount. If any invalid
//inputs are detected, throw a custom exception called InvalidInputException with an
//appropriate error message. Implement the InvalidInputException class.
package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        float accountBalance;
        float withdrawAmmount;
        try{
            System.out.println("Enter Account Balance");
            accountBalance=scan.nextFloat();
            if(accountBalance<0)
                throw new InvalidInputException("Invalid input, please enter a positive number");
            System.out.println("Enter withdraw ammount");
            withdrawAmmount=scan.nextFloat();
            if(withdrawAmmount<0)
                throw new InvalidInputException("Invalid input, please enter a positive number");

        }
        catch(  InvalidInputException e){
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e+": Enter a numeric value");
        }
    }
}
class InvalidInputException extends Exception{
    public InvalidInputException(String str){
        super(str);
    }
}


