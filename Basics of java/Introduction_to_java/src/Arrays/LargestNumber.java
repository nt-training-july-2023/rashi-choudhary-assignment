package Arrays;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[]args){
        int[]arr=new int[]{2,31,1,5,10};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        System.out.println("The largest number is "+largest);

    }
}
