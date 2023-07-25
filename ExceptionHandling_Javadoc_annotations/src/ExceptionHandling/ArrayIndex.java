//Design a Java program that defines a list of strings. The program should prompt the user for
//an index and display the element at that index. Handle the scenario where the user enters
//an invalid index (out of bounds) or tries to access an element from a null list. Throw
//appropriate exceptions (IndexOutOfBoundsException and NullPointerException) with
//informative messages.
package ExceptionHandling;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String []arr={"a","b","c","d","abc","jkl"};
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
