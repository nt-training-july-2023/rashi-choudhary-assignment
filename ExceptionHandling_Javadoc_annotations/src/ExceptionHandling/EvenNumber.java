//Create a Java program that prompts the user for an integer input and checks if it is an even
//number. If the number is even, print &quot;It&#39;s an even number.&quot; If the number is odd or non-
//numeric, throw a custom exception called NotEvenNumberException with an informative
//message. Implement the NotEvenNumberException class.
package ExceptionHandling;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int number;
        try{
          System.out.println("Enter a number");
          number=scan.nextInt();
          if(number%2==0)
              System.out.println("It's an even number");
          else
              throw new NotEvenNumberException("The entered number is not even");
        }
        catch (NotEvenNumberException e){
            System.out.println("NotEvenNumberException"+e);
        }
    }
}
class NotEvenNumberException extends Exception{
    public NotEvenNumberException(String str){
        super(str);
    }
}
