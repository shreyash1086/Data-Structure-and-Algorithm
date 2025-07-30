package TUF.PracticeArrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        ZeroBrute(arr);
    }
    static void ZeroBetter(int[][] arr){
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static void ZeroBrute(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    markRow(arr,i);
                    markCol(arr,j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void markRow(int[][] arr,int i){
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] !=0){
                arr[i][j] = -1;
            }
        }
    }
    static void markCol(int[][] arr,int j){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][j] != 0){
                arr[i][j] =-1;
            }
        }
    }

}
