package OperatorAndExpression.IncrementDecrement;

public class IncrementDecrementOperator {
    public static void main(String[]args){
        int a=5;
        int b=10;
        //It will print a++= 5 as increment operator is applied after the variable a then it will first print the value and then increment
        System.out.println("a++ = "+a++);
        //as a is incremented, if i print it now it will print 6
        System.out.println(a);
        //It will print 7 as increment operator is applied before the variable it will first increment the value and then print it
        System.out.println("++a ="+ ++a);
        //It will print b--= 10 as decrement operator is applied after the variable a then it will first print the value and then decrement
        System.out.println("b-- = "+ b--);
        //as b is decremented, if i print it now it will print 9
        System.out.println(b);
        //It will print 8 as decrement operator is applied before the variable it will first decrement the value and then print it
        System.out.println("--b ="+ --b);


    }
}
