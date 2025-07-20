package TUF.PracticeArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        OptimalRotate(matrix);
    }



    static void OptimalRotate(int[][] matrix){
        int n = matrix.length;

        //transpose
        //time O(n/2 * n/2)
        for(int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++) {
                swap(matrix,i,j);
            }
        }

        for (int i = 0; i < n; i++) {
            reverse(matrix[i],0,matrix[i].length-1);
        }
    }

    static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //time O(n* n/2)
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    //this logic rotates the 2D array by 90 degree
    //time complexity is O(m*n) and space complexity is O(m*n)
    static void rotate(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        int[][] arr = new int[n][m];

        for (int j = left; j <= right; j++) {
            int k = 0;
            for (int i = bottom; i >= top; i--) {
                arr[j][k] = matrix[i][j];
                k++;
            }
            k=0;
        }

        for(int[] i: arr){
            for(int k: i){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
