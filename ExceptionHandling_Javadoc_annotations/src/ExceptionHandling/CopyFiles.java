//Write a Java program that copies the content of one text file to another. The program should
//        take the filenames of the source and destination files as user input. Implement exception
//        handling to deal with potential IOExceptions that may occur during file reading and writing.
//        Provide appropriate error messages for file-related exceptions.
package ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class CopyFiles {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name of first file");
        String f1=scan.next();
        System.out.println("Enter name of second file");
        String f2=scan.next();
        File file1=new File("C:\\Users\\rashi\\IdeaProjects\\ExceptionHandling_Javadoc_annotations\\src\\ExceptionHandling\\"+f1);
        File file2=new File("C:\\Users\\rashi\\IdeaProjects\\ExceptionHandling_Javadoc_annotations\\src\\ExceptionHandling\\"+f2);
        CopyFiles cp=new CopyFiles();
        cp.fileCopy(file1,file2);
    }
    public void fileCopy(File file1, File file2){
        try {
            FileInputStream input=new FileInputStream(file1);
            FileOutputStream output=new FileOutputStream(file2);
            int temp;
            while((temp=input.read())!=-1){
                output.write((char)temp);
            }
            System.out.println("File "+file2+" updated successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e+" Enter valid file names");
        } catch (IOException e) {
         System.out.println(e);
        }


    }
}
