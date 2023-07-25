package OperatorAndExpression;

public class BitwiseOperator {
    public static void main(String[]args){
        int num1=10,num2=34;
        //use of bitwise OR (|) operator
        System.out.println("Bitwise OR of "+num1+" and "+num2+" is "+(num1|num2));
        //use of bitwise AND (&) operator
        System.out.println("Bitwise AND of "+num1+" and "+num2+" is "+(num1 & num2));
        //use of bitwise XOR (^) operator
        System.out.println("Bitwise XOR of "+num1+" and "+num2+" is "+(num1 ^ num2));
        //use of bitwise COMPLEMENT (~) operator
        System.out.println("Bitwise COMPLEMENT of is "+ ~num1);

        //use of left shift (<<) operator
        System.out.println("Left shift of "+num1+" by 2 is "+ (num1<<2));
        //use of right shift (>>) operator
        System.out.println("Right shift of "+num1+" by 2 is "+ (num1>>2));
        //eg of signed right shift
        int a=8,b=-8;
        System.out.println("8 >> 2 = "+(a>>2)); // prints 2
        System.out.println("-8 >> 2 = "+ (b>>2)); // prints -2

        //eg of unsigned right shift

        System.out.println("8 >> 2 = "+(a>>>2)); // prints 2
        System.out.println("-8 >> 2 = "+ (b>>>2)); // prints 1073741822
    }
}
