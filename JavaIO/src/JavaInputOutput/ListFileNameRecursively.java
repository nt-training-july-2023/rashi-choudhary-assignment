package JavaInputOutput;

import java.io.File;

public class ListFileNameRecursively {
    public static void main(String[]args){
        File file=new File("C:\\Users\\rashi\\documents");
        if(file.exists()&&file.isDirectory()) {
            File[] arr = file.listFiles();
            printFile(arr,0,0);
        }


    }
    public static void printFile(File[]arr,int a,int l){
        if(arr==null) return;
        if(a== arr.length)
            return;
        for (int i = 0; i < l; i++) {
            System.out.print("\t");
        }
        if (arr[a].isFile())
            System.out.println(arr[a].getName());
        else if (arr[a].isDirectory()) {
            System.out.println("[" + arr[a].getName()+ "]");
            printFile(arr[a].listFiles(), 0, l + 1);
        }
        printFile(arr,++a,l);


    }
}

