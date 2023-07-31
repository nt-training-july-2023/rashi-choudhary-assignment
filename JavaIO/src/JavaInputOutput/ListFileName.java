package JavaInputOutput;
//Write a Java program to get a list of all file/directory names from the directory: C://Documents.
import java.io.File;

public class ListFileName {
    public static void main(String[]args){

        File file=new File("C:\\Users\\rashi\\Documents");
        if(file.exists()&& file.isDirectory()){
            File[] filArr= file.listFiles();
            for(int i=0;i<filArr.length;i++){
                
                System.out.println(filArr[i].getName());
            }
        }
        else
            System.out.println("File does not exist");
    }
}
