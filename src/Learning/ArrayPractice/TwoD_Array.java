package Learning.ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        for (int i : arr2){
            System.out.println(i);
        }

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
