package Arrays;

public class AverageOfNumbers {
    public float averageOfNumbers(int[]arr){
        float avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        return avg/arr.length;
    }
    public static void main(String[]args){
        int[]arr={10,10,10,10,10};
        AverageOfNumbers avnumber=new AverageOfNumbers();
        System.out.println("The average of numbers in array is "+avnumber.averageOfNumbers(arr));
    }
}
