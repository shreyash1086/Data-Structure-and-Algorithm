package Learning.Recursion;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7,5,6};
        reverseUsingOneVariable(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseUsingTwoVariables(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        swap(arr,l,r);
        reverseUsingTwoVariables(arr,l+1,r-1);
    }

    static void reverseUsingOneVariable(int[] arr,int i){
        if(i>=arr.length/2){
            return;
        }
        swap(arr,i, arr.length-i-1);
        reverseUsingOneVariable(arr,i+1);
    }


    static void swap(int[]arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
