package Algorithms.Selection_Sort;

import java.util.Arrays;

public class SelectionSortPractice {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selectionSort(arr);
    }

    //time - O(n^2) and space O(1)
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
