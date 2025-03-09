package Merge_Sort;

import java.util.ArrayList;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,2};
        System.out.println("Before");
        for(int x:arr){
            System.out.println(x);
        }
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr,low,high);
        System.out.println("After");
        for (int x:arr){
            System.out.println(x);
        }
    }
    static void mergeSort(int[] arr, int low, int high){

    }
    static void merge(int[] arr,int low, int mid, int high){
        
    }
}
