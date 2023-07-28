package JavaInputOutput.InputOutputStreamSubclasses;

import java.io.*;

public class SubclassesDemo {
    public static void main(String[]args){
        byte[]arr={1,2,3,4,5};
        ByteArrayInputStreamDemo byte1=new ByteArrayInputStreamDemo(arr);
        byte1.readArray();
        FileInputStreamDemo file1=new FileInputStreamDemo("C:\\Users\\rashi\\IdeaProjects\\JavaIO\\file1.txt");
        file1.readFile();
        BufferedInputStreamDemo file2=new BufferedInputStreamDemo("C:\\Users\\rashi\\IdeaProjects\\JavaIO\\file1.txt");
        file2.readInputFile();
    }

}
//The Java ByteArrayInputStream class, java.io.ByteArrayInputStream, of the Java IO API enables you to read data from byte arrays as streams of bytes. In other words, the ByteArrayInputStream class can turn a byte array into an InputStream.
class ByteArrayInputStreamDemo{
    byte[] arr;
    int offset;
    int length;
    public ByteArrayInputStreamDemo(byte[]arr){
        this.arr=arr;
    }
    public ByteArrayInputStreamDemo(byte[]arr,int offset,int length){
        this.arr=arr;
        this.offset=offset;
        this.length=length;
    }
    public void readArray(){
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int temp;
        while((temp=byteArrayInputStream.read())!=-1){
            System.out.print((byte)temp+" ");
        }
    }

}
//The Java FileInputStream class, java.io.FileInputStream, makes it possible to read the contents of a file as a stream of bytes. The Java FileInputStream class is a subclass of Java InputStream. This means that you use the Java FileInputStream as an InputStream (FileInputStream behaves like an InputStream).
class FileInputStreamDemo{
    String path;
    public FileInputStreamDemo(String path){
        this.path=path;
    }
    public void readFile(){
        File file=new File(path);
        try {
            FileInputStream reader=new FileInputStream(file);
            int temp;
            while((temp= reader.read())!=-1){
                System.out.print((char)temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
/*
The Java BufferedInputStream class, java.io.BufferedInputStream, provides transparent reading of chunks
of bytes and buffering for a Java InputStream, including any subclasses of InputStream. Reading larger chunks
of bytes and buffering them can speed up IO quite a bit. Rather than read one byte at a time from the network
or disk, the BufferedInputStream reads a larger block at a time into an internal buffer. When you read a byte
from the Java BufferedInputStream you are therefore reading it from its internal buffer. When the buffer is
fully read, the BufferedInputStream reads another larger block of data into the buffer. This is typically
much faster than reading a single byte at a time from an InputStream, especially for disk access and larger data
amounts.
 */
class BufferedInputStreamDemo{
    String path;
    public BufferedInputStreamDemo(String path){
        this.path=path;
    }
    public void readInputFile(){
        try {
            BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(path));
            int temp;
            while((temp=bufferedInputStream.read())!=-1){
                System.out.print((char)temp);
            }
        } catch (FileNotFoundException e) {
           System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}