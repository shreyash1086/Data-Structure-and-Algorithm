package TUF.PracticeArrays;

import java.util.Arrays;

public class RightRotateArraybyOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        OptimalRotate(arr);
    }

    //Time complexity is O(n) and space complexity is O(n)
    static void rotateRight(int[] arr){
        int[] temp = new int[arr.length];
        int last = arr[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            temp[i] = arr[i-1];
        }
        temp[0] = last;
        System.out.println(Arrays.toString(temp));
    }

    //Time complexity is O(n) and Space complexity is O(1)
    static void OptimalRotate(int[] arr){
        for (int i = arr.length-1; i > 0; i--) {
            swap(arr,i,i-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}