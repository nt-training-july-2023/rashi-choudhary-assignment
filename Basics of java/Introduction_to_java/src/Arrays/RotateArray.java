package Arrays;

public class RotateArray {
   public void reverse(int[]arr,int start,int end){
       while(start<=end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }

    }
    public void reverseArray(int[]arr,int position){
       reverse(arr,0,arr.length-position-1);
       reverse(arr,arr.length-position,arr.length-1);
       reverse(arr,0,arr.length-1);
    };
    public static void main(String[]args){
        int[]arr=new int[]{1,2,3,4,5};
        int position=2;
        RotateArray ra=new RotateArray();
        ra.reverseArray(arr,position);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
