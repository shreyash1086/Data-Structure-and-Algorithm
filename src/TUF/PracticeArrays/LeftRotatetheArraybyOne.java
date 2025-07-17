package TUF.PracticeArrays;

import java.util.Arrays;

public class LeftRotatetheArraybyOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Brute(arr);
    }


    // Time complexity is O(n) and space complexity is O(1)
    static void Optimal(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return;
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] =temp;
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp; // replacing last element with the first
        System.out.println(Arrays.toString(arr));
    }

    // Time complexity is O(n) and Space complexity is O(n)
    static void Brute(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return;
        }
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }

        newArr[arr.length-1] = arr[0];

        System.out.println(Arrays.toString(newArr));
    }
}
