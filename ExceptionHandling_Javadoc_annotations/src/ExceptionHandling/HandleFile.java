//Create a Java program that reads data from a text file specified by the user. The program
//should handle potential exceptions such as the file not found, permission issues, or other
//file-related exceptions gracefully using proper exception handling techniques. Provide
//appropriate error messages for each type of exception.
package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HandleFile {
    public static void main(String []args)  {
        Scanner scan=new Scanner(System.in);
        String str="";
        try{
            System.out.println("Enter the name of the file");
            str=scan.next();
            FileReader file=new FileReader("C:\\Users\\rashi\\IdeaProjects\\ExceptionHandling_Javadoc_annotations\\src\\ExceptionHandling\\"+str);
            int temp;
            while((temp=file.read())!=-1){
                System.out.print((char)temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e+" The file "+str+" does not exist ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
