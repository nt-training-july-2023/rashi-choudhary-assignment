package AssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to implement a lambda expression to replace vowels with ‘#’ in a given string
public class ReplaceVowel {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        System.out.println("Enter a character");
        char ch=scan.next().charAt(0);
        StringManipulate obj=( String st,char c)->{
            String result="";
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
                    result=result.concat(String.valueOf('#'));
                else
                    result=result.concat(String.valueOf(st.charAt(i)));
            }

            return result;
        };
        System.out.println("String after manipulation is "+obj.manipulateString(str,ch));

    }
}
interface StringManipulate{
    String manipulateString(String str,char ch);
}
