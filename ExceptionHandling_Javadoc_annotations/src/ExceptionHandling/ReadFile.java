package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public void fileRead(String fileName) throws IOException {
        FileReader fileReader=null;
        try{
            //File f= new File();
            fileReader=new FileReader("C:\\Users\\rashi\\IdeaProjects\\ExceptionHandling_Javadoc_annotations\\src\\ExceptionHandling\\"+fileName);
            int temp;
            while((temp=fileReader.read())!=-1){
                System.out.print((char)temp);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e+" The file with name "+fileName+" does not exist");
        }
        finally {
            if(fileReader!=null){
                fileReader.close();
            }
        }
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the file name");
        String str=scan.next();
        ReadFile rf=new ReadFile();
        try {
            rf.fileRead(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
