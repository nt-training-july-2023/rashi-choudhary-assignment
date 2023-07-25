package Arrays;

public class AddMatrix {
    public int[][] addMatrix(int[][]arr,int[][]brr){

            int[][] result = new int[arr.length][arr[0].length];
            for (int i = 0; i < arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    result[i][j]=arr[i][j]+brr[i][j];
                }
            }
            return result;
    }
    public static void main(String[]args){
        int[][] arr=new int[][]{
                {1,2,3},
                {4,5,6},
                {1,2,3}
        };
        int[][] brr=new int[][]{
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        if(arr.length==brr.length && arr[0].length==brr[0].length) {
            AddMatrix am = new AddMatrix();
            int[][] result = am.addMatrix(arr, brr);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }

                System.out.println();
            }
        }
        else{
            System.out.println("Addition is not possible");
        }
    }
}
