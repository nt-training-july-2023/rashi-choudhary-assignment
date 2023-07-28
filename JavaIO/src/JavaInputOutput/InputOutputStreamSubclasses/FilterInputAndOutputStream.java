package JavaInputOutput.InputOutputStreamSubclasses;

import java.io.*;

public class FilterInputAndOutputStream {
    public static void main(String[]args){
        String file1="C:\\Users\\rashi\\IdeaProjects\\JavaIO\\file1.txt";
        String file2="C:\\Users\\rashi\\IdeaProjects\\JavaIO\\file2.txt";
        FilterInputStreamDemo filterInputStreamDemo=new FilterInputStreamDemo(new File(file1),new File(file2));
        filterInputStreamDemo.readFile();
    }
}
class FilterInputStreamDemo {
    File path;
    File destinationFile;

    public FilterInputStreamDemo(File path,File destinationFile){
        this.path=path;
        this.destinationFile=destinationFile;

    }
    public void readFile(){

        try {
            FilterOutputStream filterOutputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));

            FilterInputStream inputStream=new BufferedInputStream(new FileInputStream(path) );
            int temp;
            while((temp=inputStream.read())!=-1){
                System.out.print((char)temp);
               filterOutputStream.write((char)temp);

            }
            filterOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }


     }
}

