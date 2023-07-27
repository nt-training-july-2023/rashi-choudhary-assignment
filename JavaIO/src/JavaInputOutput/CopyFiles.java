package JavaInputOutput;
//Write a program to copy contents of one txt file to other txt file.
import java.io.*;
import java.util.Scanner;

public class CopyFiles {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the file name to copy the content of file1 ");
        String str=scan.next();
        File file2=new File("C:\\Users\\rashi\\IdeaProjects\\JavaIO\\"+str);
        try {
            if(file2.createNewFile())
                System.out.println("File "+str+" is created");
            File file1=new File("C:\\Users\\rashi\\IdeaProjects\\JavaIO\\file1.txt");
            FileInputStream reader=new FileInputStream(file1);

            FileOutputStream writer=new FileOutputStream(file2);
            int temp;
            while((temp=reader.read())!=-1){
                writer.write((char)temp);
            }
            writer.close();
            reader.close();
            System.out.println("The file is copies successfully");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
