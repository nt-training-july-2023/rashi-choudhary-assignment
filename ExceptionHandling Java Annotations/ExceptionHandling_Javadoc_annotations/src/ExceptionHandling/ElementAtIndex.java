//Write a Java program that initializes an array of integers and prompts the user for an index
//to access an element. Handle the scenario where the user enters an invalid index (out of
//bounds) or tries to access an element from a null array. Throw appropriate exceptions
//(IndexOutOfBoundsException and NullPointerException) with informative messages.
package ExceptionHandling;

import java.util.Scanner;

public class ElementAtIndex {

    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8};
        int index;
        try{
            System.out.println("Enter the index");
            index=scan.nextInt();
            System.out.println(arr[index]);

        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e+" Enter a valid index");
        }
        catch (NullPointerException e){
            System.out.println(e+" Trying to access a null list");
        }
    }
}
