package JavaInputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
//Create a program to "invert" the contents of a text file: create a file with the
//same name ending in ".txt" and containing the same lines as the original
//file but in reverse order (the first line will be the last one, the second will be
//the penultimate, and so on, until the last line of the original file, which
//should appear in the first position of the resulting file.)
public class InvertFile {
    public  static void main(String[]args){
        ArrayList<String> list=new ArrayList<>();
        try {
            File file1=new File("C:\\Users\\rashi\\IdeaProjects\\JavaIO\\file1.txt");
            Scanner reader=new Scanner(file1);

            File file2=new File("C:\\Users\\rashi\\IdeaProjects\\JavaIO\\file2.txt");

            FileOutputStream writer=new FileOutputStream(file2);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(writer));
            while(reader.hasNextLine()){
                list.add(reader.nextLine());
            }
            System.out.println(list);
            for(int i=list.size()-1;i>=0;i--){
                bw.write(list.get(i));
                bw.newLine();
            }
            bw.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
