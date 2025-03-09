package com.GFG;

public class LargextThreeInarray {
    public static void main(String[] args) {
        int[] arr = {45,78,5,61,356,31,3,6,2,451,313};
        int[] res = largest(arr);
        for(int x : res){
            System.out.println(x);
        }
    }
    static int[] largest(int[] arr){
        int large = arr[0];
        int secondLarge = 0;
        int thirdLarge = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > large){
                thirdLarge = secondLarge;
                secondLarge = large;
                large = arr[i];
            }
        }
        return new int[] {large,secondLarge,thirdLarge};
    }
}
