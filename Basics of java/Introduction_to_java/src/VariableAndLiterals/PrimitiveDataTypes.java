package VariableAndLiterals;

public class PrimitiveDataTypes {
    public static void main(String[]args){
        //declaring and initiallizing all primitive data types
        byte b=8;
        short s=45;
        int i=12345;
        long l=23458876878L;
        float f=23.89F;
        double d=67.90;
        boolean check=false;
        char c='r';

        //If we use integer literal for float data type
        float fl=12;
        System.out.println(fl);
        //It with typecast it to 12.0 with no error as it performs widening ,a large data type can store small data type

        //If we use float literal for integer data type
        //int it=12.0; it will give error , we need to typecast it forcefully

        int it=(int)12.0;
        System.out.println(it);
        //It will print 12

    }
}
