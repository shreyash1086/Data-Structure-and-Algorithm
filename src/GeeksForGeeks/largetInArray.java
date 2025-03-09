package com.GFG;

import java.util.Stack;

public class largetInArray {
    public static void main(String[] args) {
        int[] arr = {45,78,5,61,356,31,3,6,2,451,313};
        System.out.println(largest(arr));
    }
    static int largest(int[] arr){
        int large = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
}
